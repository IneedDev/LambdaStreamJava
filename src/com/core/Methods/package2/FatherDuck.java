package com.core.Methods.package2;

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
