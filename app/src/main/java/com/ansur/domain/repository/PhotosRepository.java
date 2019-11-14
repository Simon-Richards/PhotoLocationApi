package com.ansur.domain.repository;

import com.ansur.domain.model.PhotosResponse;

public interface PhotosRepository {
    void getPhotos(GetPhotosCallback getPhotosCallback);

    interface GetPhotosCallback {
        void onServerResponseSuccess(PhotosResponse response);
        void onServerResponseFailure(String error);
        void notifyError(String message);
    }
}
