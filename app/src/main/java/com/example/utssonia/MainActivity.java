package com.example.utssonia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecylerView adapterRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i =0; i <MyItem.judulNovel.length; i++){
            data.add(new ItemModel(
                    MyItem.judulNovel[i],
                    MyItem.tahunNovel[i],
                    MyItem.poster[i]
            ));
        }

        adapterRecyclerView = new AdapterRecylerView(data);
        recyclerView.setAdapter(adapterRecyclerView);
    }

}

