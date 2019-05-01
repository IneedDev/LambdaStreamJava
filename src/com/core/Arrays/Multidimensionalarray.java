package com.core.Arrays;

import java.util.Arrays;

public class Multidimensionalarray {

    public static void main(String[] args) {

        int [][] multiarray;
        int[] vars2[];
        int vars3[][];

        String  [] [] rectangle = new String [2][3];

        System.out.println(Arrays.toString(rectangle));
        System.out.println("Print 2D array with for each loop");
        for (String[] strings : rectangle) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
        System.out.println("Print 2D array with for loop");
        for (int i=0; i<rectangle.length;i++){
            System.out.println(i);
            for (int j=0; j<rectangle[i].length; j++){
                System.out.println(rectangle[i][j]);
            }
        }
        System.out.println(Thread.currentThread());


    }

}
