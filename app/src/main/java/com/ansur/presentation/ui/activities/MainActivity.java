package com.ansur.presentation.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ansur.Constants;
import com.ansur.R;
import com.ansur.domain.executor.impl.ThreadExecutor;
import com.ansur.domain.model.Photo;
import com.ansur.domain.model.PhotosResponse;
import com.ansur.presentation.adapters.PhotosAdapter;
import com.ansur.presentation.presenters.PhotosPresenter;
import com.ansur.presentation.presenters.impl.PhotosPresenterImpl;
import com.ansur.storage.PhotosApiRepository;
import com.ansur.threading.MainThreadImpl;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PhotosPresenter.View, PhotosAdapter.ListItemClickListener {
    private static final String TAG = "MainActivity";

    @BindView(R.id.photos_recycler_view)
    RecyclerView photosRecyclerView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    private PhotosPresenter presenter;
    private PhotosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        photosRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        presenter = new PhotosPresenterImpl(
                ThreadExecutor.getInstance(),
                MainThreadImpl.getInstance(),
                this,
                new PhotosApiRepository()
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    public void displayPhotos(PhotosResponse response) {
        ArrayList<Photo> photoList = (ArrayList<Photo>) response.getData().getPhotos();
        adapter = new PhotosAdapter(this, photoList, this);
        photosRecyclerView.setAdapter(adapter);
    }

    @Override
    public void navigateToDetailScreen(double latitude, double longitude) {
        if (latitude == Constants.ILLEGAL_LAT_LONG || longitude == Constants.ILLEGAL_LAT_LONG) {
            Toast.makeText(MainActivity.this,
                    R.string.no_coordinates_found, Toast.LENGTH_LONG).show();
        } else {
            //Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            //intent.putExtra(Constants.LATITUDE_DOUBLE_EXTRA, latitude);
            //intent.putExtra(Constants.LONGITUDE_DOUBLE_EXTRA, longitude);
            //startActivity(intent);
        }
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(double latitude, double longitude) {
        navigateToDetailScreen(latitude, longitude);
    }
}
