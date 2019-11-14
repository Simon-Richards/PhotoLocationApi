package com.ansur.presentation.ui.viewmodel;

import com.ansur.presentation.presenters.PhotosPresenter;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private PhotosPresenter presenter;

    public MainActivityViewModel(PhotosPresenter presenter) {
        this.presenter = presenter;
    }

    public void resume() {
        presenter.resume();
    }
}
