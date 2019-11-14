package com.ansur.presentation.ui.viewmodel;

import com.ansur.presentation.presenters.PhotosPresenter;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MainActivityViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private PhotosPresenter presenter;

    public MainActivityViewModelFactory(PhotosPresenter presenter) {
        this.presenter = presenter;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainActivityViewModel(presenter);
    }
}
