package com.ansur.storage;

import com.ansur.domain.model.PhotosResponse;
import com.ansur.domain.repository.PhotosRepository;
import com.ansur.network.PhotosClient;
import com.ansur.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PhotosApiRepository implements PhotosRepository {

    private final String UNKNOWN_NETWORK_ERROR_MSG = "Unknown error from API request";
    private final String NETWORK_ERROR_CODE_MSG = "Error! The server returned:";

    private PhotosClient client = getClient();
    private PhotosClient getClient() {
        Retrofit retrofit = RetrofitInstance.getRetrofitInstance();
        return retrofit.create(PhotosClient.class);
    }

    @Override
    public void getPhotos(final GetPhotosCallback getPhotosCallback) {

        Call<PhotosResponse> call = client.getPhotos();

        call.enqueue(new Callback<PhotosResponse>() {
            @Override
            public void onResponse(Call<PhotosResponse> call, Response<PhotosResponse> response) {
                switch (response.code()) {
                    case 200:
                        getPhotosCallback.onServerResponseSuccess(response.body());
                        break;
                    default:
                        getPhotosCallback.onServerResponseFailure(
                                NETWORK_ERROR_CODE_MSG + " " + Integer.toString(response.code())
                        );
                }
            }

            @Override
            public void onFailure(Call<PhotosResponse> call, Throwable throwable) {
                String errorMsg = throwable.getMessage() != null ? throwable.getMessage() : UNKNOWN_NETWORK_ERROR_MSG;
                getPhotosCallback.notifyError(errorMsg);
            }
        });
    }
}
