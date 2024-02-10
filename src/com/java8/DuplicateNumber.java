package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> set = new HashSet<>();

       List<Integer> list =  myList.stream().filter(a -> !set.add(a)).collect(Collectors.toList());
       System.out.println(list);
        //List<Integer> collect = myList.stream().filter(a -> !set.add(a)).collect(Collectors.toList());
        //System.out.println(collect);

    }
}
