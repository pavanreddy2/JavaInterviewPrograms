package com.java8Techie;

import java.util.Arrays;

public class LongestStringFromAnArray {
    public static void main(String[] args) {
        String[] str = {"java","techie", "springboot","microservice"};

        //converting Arrays to String
     String logestString =   Arrays.stream(str)
                .reduce((str1, str2) -> str1.length()>str2.length() ? str1 : str2)
                        .get();
     System.out.println(logestString);
    }
}
