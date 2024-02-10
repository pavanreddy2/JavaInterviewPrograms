package com.InterviewByMe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc","abc","xyz");
        //count of duplicate

       Map<String,Long> count =  list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(count);

        //3rd Higest Salary and maximum age in list
    }
}
