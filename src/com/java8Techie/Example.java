package com.java8Techie;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(num).filter(n ->n % 2 ==0)
                //applies a transformation to each element of the filtered stream. It subtracts 1 from each number.
                .map(n -> n -1).forEach(System.out::println);
    }
}
