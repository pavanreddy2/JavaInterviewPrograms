package com.java8Techie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInString {
    public static void main(String[] args) {

       // int i = 10/0; //==>
       // int* a = 10; // pointer

       int i = 100;


        String str = "ilovejavatechie";

      List<String> duplicateElemenst =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet().stream()
                        .filter(a -> a.getValue() > 1)
                            .map(Map.Entry :: getKey)
                                .collect(Collectors.toList());

      System.out.println(duplicateElemenst);
      //** Find Unique elements in String
       List<String>  uniqueElements = Arrays.stream(str.split(""))
                   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                            .filter(e -> e.getValue() == 1)
                                .map(Map.Entry::getKey)
                                    .collect(Collectors.toList());
       System.out.println(uniqueElements);

    }
}
