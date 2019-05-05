package com.core.Methods.package2;

public class MotherDuck {

    String noise = "quack";

    void  quack(){
        System.out.println(noise);
    }

    private void makeNoise(){
        quack();
    }
}
