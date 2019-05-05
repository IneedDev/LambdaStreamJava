package com.core.Methods;

public class Main {

    public static final int Const = 4;

    public static int count = 0;

    public static void walk(int start, int...nums){
        System.out.println(nums.length);
    }
    public static void main(String[] args) {

        walk(1);
        walk(1,2);
        walk(1,2,3);

        // Override static final variable

        //Const=5;

    }
}
