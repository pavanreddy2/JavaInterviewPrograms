package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc","adef","xyz","uvw","");

        String result =  list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
       //String result =  list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
    System.out.println(result);

        long countStartsWithA = list.stream().filter(a -> a.startsWith("a")).count();
            System.out.println("Number of strings that start with 'a': " + countStartsWithA);

        long countEmptyStrings=list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings: " + countEmptyStrings);

    }
}
