package com.lambda.realExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{
    public static void main(String[] args) {
/*        Predicate<Integer> predicate = i-> i % 2 == 0;
        System.out.println(predicate.test(9));*/

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(i-> i%2 ==0).forEach(r -> System.out.println(r));
    }
}
