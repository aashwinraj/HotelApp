package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);
        ListView desertList = findViewById(R.id.list_view_deserts);

        Dish[] items={
                new Dish("Cocoa and blackcurrant cake"),
                new Dish("Mulberry and cardamom crumble"),
                new Dish("Lemon scones with chili jam"),
                new Dish("Potato and banana vegan crepes"),
                new Dish("Cinnamon and treacle buns"),



        };

        ArrayAdapter<Dish>  desertAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        desertList.setAdapter(desertAdapter);


    }
}