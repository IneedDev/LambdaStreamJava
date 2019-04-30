package com.core.Strings;

public class Strings {

    public static void main(String[] args) {

        int three = 3;
        String s = "1";

        System.out.println(1+2+three+s+three+s);

        s+="2";
        System.out.println(s);
        s+="5";
        System.out.println(s);

        // concatenation

        String s1 = "abs";
        String s2 = s1.concat("cba");
        s2.concat("ABC");
        //we can not overrirde variable s2 because of String is immutable
        System.out.println(s2);

        // differnce between == nad equals

        String pablo1 = "pablo";
        String pablo2= "pablo";
        String pablo3 = new String(pablo1);
        String pablo4 = new String(pablo2);

        System.out.println(pablo1==pablo2);
        System.out.println(pablo3==pablo4);
        System.out.println("-----------------");
        System.out.println(pablo1.equals(pablo3));
        System.out.println(pablo3.equals(pablo4));

    }
}
