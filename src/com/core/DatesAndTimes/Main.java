package com.core.DatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.of(2015,10,5));

        System.out.println("Month - enum class");
        LocalDate date1 = LocalDate.of(2019, Month.APRIL,02);


    }
}
