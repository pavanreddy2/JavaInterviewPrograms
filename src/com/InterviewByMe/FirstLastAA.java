package com.InterviewByMe;


import java.util.Arrays;
import java.util.List;

import java.util.Objects;
import java.util.stream.Collectors;

public class FirstLastAA {
    public static void main(String[] args) {
        String[] countries = {null, "Australia", "India", "America", "Malaysia", "Peru"};
        List<String> input = Arrays.asList(countries);

      List<String> collect =   input.stream()
                .filter(s -> s != null && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()- 1)))
                .map(s -> s + " AA")
                .collect(Collectors.toList());
      System.out.println(collect);
    
      /*  List<String> collect = input.stream()
                //.sequential() // Ensures processing order
                .filter(Objects::nonNull) // Filters null values explicitly
                .filter(s -> Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length() - 1))) // Case-insensitive comparison
                .map(s -> s + " AA") // Adds " AA" to each string
                .collect(Collectors.toList());

        System.out.println(collect); // Outputs: [Australia AA, America AA]*/
    }
}
