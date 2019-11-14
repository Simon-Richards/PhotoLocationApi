package com.ansur.presentation.presenters.impl;

import com.ansur.domain.executor.Executor;
import com.ansur.domain.executor.MainThread;
import com.ansur.domain.interactors.PhotosInteractor;
import com.ansur.domain.interactors.impl.PhotosInteractorImpl;
import com.ansur.domain.model.PhotosResponse;
import com.ansur.domain.repository.PhotosRepository;
import com.ansur.presentation.presenters.PhotosPresenter;
import com.ansur.presentation.presenters.base.AbstractPresenter;

public class PhotosPresenterImpl extends AbstractPresenter implements PhotosPresenter, PhotosInteractor.Callback {

    private PhotosPresenter.View view;
    private PhotosRepository photosRepository;

    public PhotosPresenterImpl(Executor executor, MainThread mainThread,
                               PhotosPresenter.View view, PhotosRepository photosRepository) {
        super(executor, mainThread);
        this.view = view;
        this.photosRepository = photosRepository;
    }

    @Override
    public void onPhotosRetrieved(PhotosResponse response) {
        view.hideProgress();
        view.displayPhotos(response);
    }

    @Override
    public void onRetrievalFailed(String error) {
        view.hideProgress();
        onError(error);
    }

    @Override
    public void resume() {
        view.showProgress();

        PhotosInteractor interactor = new PhotosInteractorImpl(
                executor,
                mainThread,
                this,
                photosRepository
        );
        ((PhotosInteractorImpl) interactor).execute();
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {
        view.showError(message);
    }
}
