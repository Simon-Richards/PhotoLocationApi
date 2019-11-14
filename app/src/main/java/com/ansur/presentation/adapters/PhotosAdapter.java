package com.ansur.presentation.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ansur.Constants;
import com.ansur.R;
import com.ansur.domain.model.Photo;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.MyViewHolder> {

    private Context context;
    private List<Photo> photosList;
    private ListItemClickListener itemClickListener;

    public interface ListItemClickListener {
        void onItemClick(double latitude, double longitude);
    }

    public PhotosAdapter(Context context, List<Photo> photosList, ListItemClickListener itemClickListener) {
        this.context = context;
        this.photosList = photosList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public PhotosAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item_photo, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotosAdapter.MyViewHolder myViewHolder, int i) {
        String thumbnailUrl = photosList.get(i).getThumbnailUrl();

        Photo photo = photosList.get(i);

        double latitude = photo.getLocationLatitude() != null ? photo.getLocationLatitude() : Constants.ILLEGAL_LAT_LONG;
        double longitude = photo.getLocationLongitude() != null ? photo.getLocationLongitude() : Constants.ILLEGAL_LAT_LONG;

        Picasso.get().load(thumbnailUrl).into(myViewHolder.photoImageView);
        myViewHolder.itemView.setTag(R.id.latitude, latitude);
        myViewHolder.itemView.setTag(R.id.longitude, longitude);
    }

    @Override
    public int getItemCount() {
        int itemCount = photosList != null ? photosList.size() : 0;
        return itemCount;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.photo_image_view)
        ImageView photoImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            double latitude = (double) v.getTag(R.id.latitude);
            double longitude = (double) v.getTag(R.id.longitude);
            itemClickListener.onItemClick(latitude, longitude);
        }
    }
}
