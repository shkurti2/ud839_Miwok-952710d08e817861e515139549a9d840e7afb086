package com.example.android.miwok.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.android.miwok.R;
import com.hannesdorfmann.adapterdelegates3.AbsListItemAdapterDelegate;

import java.util.List;

/**
 * Created by armando.shkurti on 7/29/18.
 */
public class ImageTextAdapterDelegate extends AbsListItemAdapterDelegate<ImageText, DisplayableItem, ImageTextAdapterDelegate.ImageTextViewHolder> {


    @Override
    protected boolean isForViewType(@NonNull DisplayableItem item, @NonNull List<DisplayableItem> items, int position) {
        return item instanceof ImageText;
    }

    @NonNull
    @Override
    protected ImageTextViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        Context context = parent.getContext();
        View inflateView = LayoutInflater.from(context).inflate(R.layout.item_image_text, parent, false);
        return new ImageTextViewHolder(inflateView);
    }

    @Override
    protected void onBindViewHolder(@NonNull ImageText item, @NonNull ImageTextViewHolder viewHolder, @NonNull List<Object> payloads) {
        viewHolder.titleTextView.setText(item.title);
        viewHolder.descriptionTextView.setText(item.description);

        Glide.with(viewHolder.imageView)
                .load(item.url)
                .apply(new RequestOptions().centerCrop())
                .into(viewHolder.imageView);
    }


    static class ImageTextViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView titleTextView;
        public TextView descriptionTextView;

        public ImageTextViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}

