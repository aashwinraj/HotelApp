package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    CardView startersCard;
    CardView mainCard;
    CardView desertCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard=findViewById(R.id.card_view_starters);
        mainCard=findViewById(R.id.card_view_mains);
        desertCard=findViewById(R.id.card_view_deserts);
        startersCard.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent= new Intent(MainActivity.this,StartersActivity.class);
                startActivity(startersActivityIntent);

            }
        });

        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainCourseActivityIntent=new Intent(MainActivity.this,MainCourseActivity.class);
                startActivity(MainCourseActivityIntent);
            }
        });




        desertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desertIntent = new Intent(MainActivity.this, DesertActivity.class);

                startActivity(desertIntent);
            }
        });



        TextView emailTextView= findViewById(R.id.emailText);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent=new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:hotelnashville@gmail.com"));
                startActivity(emailIntent);
            }
        });

    }
}