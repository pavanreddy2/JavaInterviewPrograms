package com.InterviewByMe;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String s = "java pap";

      Map<Character, Long> map =  s.chars().mapToObj(c -> (char)c)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      String repeated = map.entrySet().stream()
              .filter(a -> a.getValue() > 1)
                      .map(Map.Entry::getKey)
                              .map(String::valueOf)
                                      .collect(Collectors.joining(","));
    /*    String repeatedChars = s.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> String.valueOf((char) e.getKey().intValue()))
                .collect(Collectors.joining());*/

        System.out.println("Repeated characters: " + repeated);
    }
}
