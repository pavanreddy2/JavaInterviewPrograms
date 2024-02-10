package com.string;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "java is programming language";

        System.out.println(originalString.length());
        String reverSting = "";

        for (int i = originalString.length() - 1; i>=0;i--){
            reverSting += originalString.charAt(i);
        }
        System.out.println(reverSting);
    }
}
