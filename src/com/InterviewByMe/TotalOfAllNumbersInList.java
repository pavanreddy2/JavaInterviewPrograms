package com.InterviewByMe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotalOfAllNumbersInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer collect = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(collect);
        //Way 2
      Integer sum =  list.stream().mapToInt(Integer::intValue).sum();
      System.out.println(sum);
    }
}
