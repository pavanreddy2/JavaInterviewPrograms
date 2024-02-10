package com.InterviewByMe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedStringsInList {
    public static void main(String[] args) {
        List<String>  list = Arrays.asList("java", "python", "java", "sql");

         Map<String,Long> map =  list.stream()
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         map.entrySet().stream()
                 .filter(a -> a.getValue() > 1)
                 .forEach(a -> System.out.println(a.getKey() + "= ="+ a.getValue()));
    }
}
