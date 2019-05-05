package com.core.Arrays;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList alist1 = new ArrayList();
        alist1.add("Name");
        alist1.add(3);

        System.out.println(alist1);
        System.out.println("Copy of ArrayList");
        ArrayList alist2 = new ArrayList(alist1);
        System.out.println(alist2);
        System.out.println("ArrayList generic and non generic");
        ArrayList<String> generic = new ArrayList<>();
        generic.add("str1");
        ArrayList nongeneric = new ArrayList();
        nongeneric.add("String");
        nongeneric.add(0,4);
        System.out.println(generic+" \n"+nongeneric);

        System.out.println("Converting ArrayList into Array");
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Paul");
        System.out.println("Object type");

        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);

        // to keep origin data type:
        System.out.println("String type");
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
        System.out.println("---------------------------");

        System.out.println("Converting Array into ArrayList");

        String[] array = {"Paul","John"};
        List<String> stringList =Arrays.asList(array);

        stringList.set(0,"new");
        System.out.println("Update of ArrayList change also original Array");

        for (String s : stringList) {
            System.out.println(s);
        }
        for (String s : array) {
            System.out.println(s);
        }

    }
}
