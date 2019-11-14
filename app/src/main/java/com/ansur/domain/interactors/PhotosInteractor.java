package com.ansur.domain.interactors;

import com.ansur.domain.model.PhotosResponse;

public interface PhotosInteractor {

    interface Callback {
        void onPhotosRetrieved(PhotosResponse response);

        void onRetrievalFailed(String error);
    }
}
