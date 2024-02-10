package com.sureshInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,32,33,21,331);
        List<Integer> filterEven = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(filterEven);
    }
}