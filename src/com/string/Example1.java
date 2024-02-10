package com.string;

public class Example1 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");
        String s4 = new String("aBC");

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(20 + 30 +"Pavan");
        System.out.println("pavan"+ 20 + 30);
        System.out.println("pavan"+(20+30));
        System.out.println((20+30)+ "pavan");
    }
}
