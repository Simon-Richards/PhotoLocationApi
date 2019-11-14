package com.ansur.presentation.presenters;

import com.ansur.domain.model.PhotosResponse;
import com.ansur.presentation.presenters.base.BasePresenter;
import com.ansur.presentation.ui.BaseView;

public interface PhotosPresenter extends BasePresenter {

    interface View extends BaseView {
        void displayPhotos(PhotosResponse response);
        void navigateToDetailScreen(double latitude, double longitude);
    }
}
