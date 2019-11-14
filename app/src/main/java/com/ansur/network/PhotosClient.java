package com.ansur.network;

import com.ansur.domain.model.PhotosResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotosClient {

    @GET("api/photos.json")
    Call<PhotosResponse> getPhotos();
}
