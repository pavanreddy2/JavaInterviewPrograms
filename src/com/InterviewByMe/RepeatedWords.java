package com.InterviewByMe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedWords {
    public static void main(String[] args) {
        String[] words =   {"cat", "dog", "Dog", "CAT", "Elephant", "dog"};
      Map<String,Long> map = Arrays.stream(words)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      map.entrySet().stream().filter(a -> a.getValue() > 1)
              .forEach(a -> System.out.println(a.getKey()+ " " + a.getValue()));
    }
}
