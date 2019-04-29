package com.InstanceofEquals;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
       car.setName("Paul");

        MikroCar mikroCar = new MikroCar();
        mikroCar.setName("John");

        System.out.print(car.equals(mikroCar));
    }
}
