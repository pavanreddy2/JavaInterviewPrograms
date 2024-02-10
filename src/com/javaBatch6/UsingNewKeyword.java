package com.javaBatch6;

public class UsingNewKeyword {

    public static void main(String[] args) {

        String str1 = new String ("Abc");
        String str2 = new String ("Abc");

        String str3 = "Abc";
        String str4 = "Abc";

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        System.out.println(str3 == str4);

        System.out.println(str1.equals(str4));
        System.out.println(str1 == str4);

    }
}
