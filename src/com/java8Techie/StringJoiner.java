package com.java8Techie;


import java.util.Arrays;
import java.util.List;

public class StringJoiner {
    public static void main(String[] args) {
       List<String> list =  Arrays.asList("A","1","12","2");

      String result = String.join("-",list);
      System.out.println(result);
    }
}
