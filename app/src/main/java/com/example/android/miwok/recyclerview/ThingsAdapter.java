package com.example.android.miwok.recyclerview;

import com.hannesdorfmann.adapterdelegates3.ListDelegationAdapter;

import java.util.List;

/**
 * Created by armando.shkurti on 7/26/18.
 */
public class ThingsAdapter extends ListDelegationAdapter<List<DisplayableItem>> {

    public ThingsAdapter(List<DisplayableItem> items) {

        // Delegates
        this.delegatesManager.addDelegate(new InfoAdapterDelegate());
        this.delegatesManager.addDelegate(new ImageTextAdapterDelegate());

        setItems(items);
    }

}
