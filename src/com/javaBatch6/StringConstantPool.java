package com.javaBatch6;

public class StringConstantPool {

    public static void main(String[] args) {

        String str1 = "Pavan";
        String str2 = "Pavan";
        String str3 = "pavan";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str3.hashCode());

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
