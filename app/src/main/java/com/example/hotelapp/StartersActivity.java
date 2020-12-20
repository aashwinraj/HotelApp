package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        ListView starterList =findViewById(R.id.list_view_starters);

        Dish[] dishes= new Dish[] {



                new Dish("1.Strawberry and parsnip soup"),
                new Dish("2. Sole and cardamom dumplings"),
                new Dish("3. Lime and mustard seed soup"),
                new Dish("4. Pigeon and kumquat soup "),
                new Dish("5. Egusi and spinach soup "),
                new Dish("6. Kale and tomato soup "),
                new Dish("7. Pesto and scallop gyoza "),
                new Dish("8. Tofu and ricotta dumplings"),
                new Dish("9. Ricotta and salmon parcels "),
                new Dish("10. Venison and haddock soup"),


                };

        ArrayAdapter<Dish> dishesAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
starterList.setAdapter(dishesAdapter);



    };
}