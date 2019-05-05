package com.core;

public class Test {

    public static void main(String[] args) {

        String t = "string";
        String s = new String(t);
        if("string".equals(s)){
            System.out.println("one");
        }
        if(t==s){
            System.out.println("two");
        }
        if ("string" == t){
            System.out.println("four");
        }

        //method chaining
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);

        String one = "abc";
        StringBuilder two = new StringBuilder("abc");
//        if (one==two){
//            System.out.println("re");
//        }
        if (one.equals(two)){
            System.out.println("String and StringBuilder can be compared with equals()");
        }
    }
}
