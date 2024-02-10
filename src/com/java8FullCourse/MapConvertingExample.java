package com.java8FullCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapConvertingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       List<String> num = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(num);

        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<String> result = words.stream()
                .map(word -> "fruit: " + word)
                .collect(Collectors.toList());

        System.out.println(result);

        List<LocalDate> dates = Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(1));
        System.out.println(dates);
        List<String> formattedDates = dates.stream()
                .map(date -> date.format(DateTimeFormatter.ISO_DATE))
                .collect(Collectors.toList());
        System.out.println(formattedDates);

        List<String> names = Arrays.asList("John", null, "Alice", null);
        List<String> nonNullNames = names.stream()
                .map(name -> name != null ? name : "Unknown")
                .collect(Collectors.toList());
        System.out.println(nonNullNames);
    }
}
