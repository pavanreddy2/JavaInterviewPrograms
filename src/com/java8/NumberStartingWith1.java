package com.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(a -> a + "")//Converting Integer to String
        .filter(i -> i.startsWith("1")).forEach(System.out::println);
    }
}
