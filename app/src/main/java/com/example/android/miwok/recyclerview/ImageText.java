package com.example.android.miwok.recyclerview;

/**
 * Created by armando.shkurti on 7/29/18.
 */
public class ImageText implements DisplayableItem{

    public String url;

    public String title;

    public String description;

    public ImageText(String url, String title, String description) {
        this.url = url;
        this.title = title;
        this.description = description;
    }
}
