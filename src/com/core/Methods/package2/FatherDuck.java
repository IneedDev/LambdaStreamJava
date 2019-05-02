package com.core.Methods.paskage1;

public class FatherDuck {
    private String noise="quack";

    private void quack(){
        System.out.println(noise);
    }

    //access available

    private void makeNoise(){
        quack();
    }
}
