package com.core.Strings;

import java.util.Locale;

public class Stringmethods {
    public static void main(String[] args) {

        String s1 = "    ABCwwwABc";
        String s2 = "12we3";
        System.out.println(s1.length());

        System.out.println("---------------");
        System.out.println(s1.isEmpty());

        System.out.println("---------------");
        System.out.println(s1.hashCode());

        System.out.println("-------c--------");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo("ABC"));

        System.out.println("---------------");
        System.out.println(s1.contains("B"));


        System.out.println("---------------");
        System.out.println(s1.charAt(1));
        System.out.println("---------------");
        System.out.println(s1.indexOf("C"));
        System.out.println(s1.indexOf("BC"));
        System.out.println(s1.indexOf('A',2));
        System.out.println("---------------");
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,6));

        System.out.println("---------------");
        System.out.println(("\t     a b c \n").trim());
        System.out.println("---------------");
        System.out.println(s1.trim().toUpperCase().substring(2).toLowerCase().toLowerCase(Locale.CHINA));
        System.out.println("---------------");
        System.out.println("---------------");
        String alpha = "";
        for (char current = 'a'; current <='z';current++)
            alpha+=current;
        System.out.println(alpha + alpha.length());

        StringBuilder alpha2 = new StringBuilder();
        String output="";
        for(char alfabet ='a'; alfabet<='z';alfabet++){
            output+=alfabet;
        }
        System.out.println(output + output.length());
        System.out.println("---------------");
        StringBuilder capacity = new StringBuilder(25);
        System.out.println(capacity.capacity());
        System.out.println(capacity.length());
    }
}
