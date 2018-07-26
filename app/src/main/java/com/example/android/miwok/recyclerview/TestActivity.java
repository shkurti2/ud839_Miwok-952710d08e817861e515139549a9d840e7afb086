package com.example.android.miwok.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.miwok.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by armando.shkurti on 7/26/18.
 */
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);


        RecyclerView recyclerViewToni = findViewById(R.id.recyclerViewTest);
        recyclerViewToni.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        List<DisplayableItem> displayableItemList = new ArrayList<>();
        displayableItemList.add(new Information("hello"));

        Information info = new Information("nje fjale");
        displayableItemList.add(info);

        ThingsAdapter colorAdapterDelegate = new ThingsAdapter(displayableItemList);

        recyclerViewToni.setAdapter(colorAdapterDelegate);

    }
}
