package com.InterviewByMe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,31,21,44,24,35,37);

        BiFunction<Integer,Integer,List<Integer>> biFunction =
                (start, end) -> {
                List<Integer> range = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    if (list.contains(i)) {
                        range.add(i);
                    }
                }
                    return range;
                };


        List<Integer> integerList = biFunction.apply(5, 40);
        System.out.println(integerList);
    }
}
