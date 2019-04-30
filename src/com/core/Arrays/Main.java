package com.core.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Array for primitives

        int intarray[] = new int[3];
        System.out.println(Arrays.toString(intarray));

        System.out.println("since Java5 we have Arrays.toString() method to print arrays");
        int[] a2 = new int[]{1,2,5};
        System.out.println(Arrays.toString(a2));

        int[] a3 = {1,2,5,5};
        System.out.println("Anonymous array");
        System.out.println(Arrays.toString(a3));

        System.out.println("-------------");
        String names[] = new String[2];
        System.out.println(Arrays.toString(names));

        int[] a4= new int[10];
        for (int i=0; i<a4.length;i++){
            a4[i] = i+5;
        }
        System.out.println(Arrays.toString(a4));

    }

}

