package com.ansur.domain.interactors.impl;

import com.ansur.domain.executor.Executor;
import com.ansur.domain.executor.MainThread;
import com.ansur.domain.interactors.PhotosInteractor;
import com.ansur.domain.interactors.base.AbstractInteractor;
import com.ansur.domain.model.PhotosResponse;
import com.ansur.domain.repository.PhotosRepository;

public class PhotosInteractorImpl extends AbstractInteractor implements PhotosInteractor, PhotosRepository.GetPhotosCallback {

    private PhotosInteractor.Callback callback;
    private PhotosRepository photosRepository;

    public PhotosInteractorImpl(Executor threadExecutor,
                                MainThread mainThread,
                                Callback callback, PhotosRepository photosRepository) {
        super(threadExecutor, mainThread);
        this.callback = callback;
        this.photosRepository = photosRepository;
    }

    @Override
    public void run() {
        photosRepository.getPhotos(this);
    }

    @Override
    public void onServerResponseSuccess(final PhotosResponse response) {
        mainThread.post(new Runnable() {
            @Override
            public void run() {
                callback.onPhotosRetrieved(response);
            }
        });
    }

    @Override
    public void onServerResponseFailure(final String error) {
        mainThread.post(new Runnable() {
            @Override
            public void run() {
                callback.onRetrievalFailed(error);
            }
        });
    }

    @Override
    public void notifyError(final String message) {
        mainThread.post(new Runnable() {
            @Override
            public void run() {
                callback.onRetrievalFailed(message);
            }
        });
    }
}
