package com.example.hotelapp;

public class Dish {
    String title;

    int price;
            Dish(String t)
            {
                title=t;

                price=500;
            }


    @Override
    public String toString() {
        return title + '\'' + "       "   +"price= " + price ;
    }
}
