package com.java8Techie;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacterInString {
    public static void main(String[] args) {
        String str = "ilovejavatechie";
     String firstNonRepeatedElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet().stream()
                        .filter(a -> a.getValue() == 1)
                            .findFirst()
                                .get().getKey();
     System.out.println(firstNonRepeatedElements);
    }
}
