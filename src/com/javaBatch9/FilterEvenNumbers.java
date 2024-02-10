package com.javaBatch9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 5, 2, 4, 8, 4, 10);
       List<Integer> even =  numbers.stream().filter(a -> a%2 == 0)
               .distinct()
               .map(e1 -> e1*e1)
               .collect(Collectors.toList());
       
       System.out.println(even);
    }
}
