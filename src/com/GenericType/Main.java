package com.GenericType;

public class Main {

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setItem("John");
        //box.setItem("String");

        if(box.getItem() instanceof String){
            System.out.print("Mamy string");
        }else {
            System.out.print("Mamy integer");
        }
        System.out.print(box.getItem());
    }
}
