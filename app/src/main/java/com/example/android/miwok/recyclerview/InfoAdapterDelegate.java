package com.example.android.miwok.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.hannesdorfmann.adapterdelegates3.AbsListItemAdapterDelegate;

import java.util.List;

/**
 * Created by armando.shkurti on 7/26/18.
 */
public class InfoAdapterDelegate extends AbsListItemAdapterDelegate<Information, DisplayableItem, InfoAdapterDelegate.InfoViewHolder> {

    @Override
    protected boolean isForViewType(@NonNull DisplayableItem item, @NonNull List<DisplayableItem> items, int position) {
        return item instanceof Information;
    }

    @NonNull
    @Override
    protected InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        Context context = parent.getContext();
        View inflateView = LayoutInflater.from(context).inflate(R.layout.item_nje_text, parent, false);
        return new InfoViewHolder(inflateView);
    }

    @Override
    protected void onBindViewHolder(@NonNull Information item, @NonNull InfoViewHolder viewHolder, @NonNull List<Object> payloads) {
        viewHolder.dataTextView.setText(item.data);
    }

    static class InfoViewHolder extends RecyclerView.ViewHolder {

        public TextView dataTextView;

        public InfoViewHolder(View itemView) {
            super(itemView);
            dataTextView = itemView.findViewById(R.id.dataTextView);
        }
    }
}
