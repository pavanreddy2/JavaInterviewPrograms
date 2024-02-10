package com;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //Create a Java 8 application to calculate the total of all the numbers in a list.

        List<Integer> list = Arrays.asList(1,2,3,4,5);

       Integer sum =  list.stream().mapToInt(Integer::intValue)
                .sum();
       System.out.println(sum);
    }
}
