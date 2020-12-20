package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
        ListView mcList= findViewById(R.id.list_view_mainCourse);

        Dish[] mc= {
                new Dish("Tempeh and bean casserole"),
                new Dish("Granola and mozzarella salad"),
                new Dish("Barley and plantain stew"),
                new Dish("Kipper and chilli oil salad"),
                new Dish(" Tahini and black pepper bagel"),
                new Dish("Fregola and leek penne"),
                new Dish("Lamb and paneer kebab"),
                new Dish("Aubergine and monkfish madras"),
                new Dish("Mussel and swede soup"),
                new Dish("Steak and pork ciabatta")
        };

        ArrayAdapter<Dish> mcAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mc);
        mcList.setAdapter(mcAdapter);
    }



}