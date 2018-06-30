package com.happytrees.daggerexample5;


import android.util.Log;

import javax.inject.Inject;

public class Car {




    @Inject//request dependencies(objects).
    public Car() {

    }

    public void drive() {
        Log.e("car", "rooaaarrr rooaaarrr rooaaarrrrrrrrrrrr");
    }

}
