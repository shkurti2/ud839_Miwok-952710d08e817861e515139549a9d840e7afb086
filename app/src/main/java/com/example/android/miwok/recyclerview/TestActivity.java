package com.example.android.miwok.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
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
        recyclerViewToni.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<DisplayableItem> displayableItemList = new ArrayList<>();
        displayableItemList.add(new Information("hello"));


        displayableItemList.add(new ImageText("https://images.unsplash.com/photo-1496950866446-3253e1470e8e?ixlib=rb-0.3.5&s=0689efcd9744fe27b6de0e191afa7512",
                "Harte",
                "Mjete udhetimi"));

        Information info = new Information("nje fjale");
        displayableItemList.add(info);

        displayableItemList.add(new ImageText("https://images.unsplash.com/photo-1462899006636-339e08d1844e?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b207890c10d8df3f11b7a520ad57d177",
                "Harte",
                "Mjete udhetimi"));

        displayableItemList.add(new ImageText("https://images.unsplash.com/photo-1478358161113-b0e11994a36b?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=a11da19e81415e5a81029aade9df7774&auto=format&fit=crop&w=668&q=80",
                "VR Headset",
                "Geneva, Switzerland"));

        displayableItemList.add(new Information("You can use VectorDrawableCompat back to API level 7 "));


        ThingsAdapter colorAdapterDelegate = new ThingsAdapter(displayableItemList);

        recyclerViewToni.setAdapter(colorAdapterDelegate);
        DividerItemDecoration decor = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        decor.setDrawable(ContextCompat.getDrawable(this, R.drawable.shape_divider));
        recyclerViewToni.addItemDecoration(decor);

    }
}
