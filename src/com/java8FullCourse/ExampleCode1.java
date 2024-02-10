package com.java8FullCourse;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExampleCode1 {
    public static void main(String[] args) {
        //How to count each element/word from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> count = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);

        //find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> nameses = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> countDuplicate = nameses.stream().filter(a -> Collections.frequency(nameses, a) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countDuplicate);
        //find the Maximum element in an array?
        int[] arr = {12, 19, 20, 88, 00, 9};
        Integer maxValue = Arrays.stream(arr).max().getAsInt();
        System.out.println(maxValue);
        //Write a program to print the count of each character in a String?
        String s = "string data to count each character";
        Map<String, Long> countCharactor = Arrays.stream(s.split(""))
                .filter(ch -> !ch.equals(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(countCharactor);
        //Write a program to print the count of each word?
        String word = "This is Java class and This is pythone class";
        Map<String, Long> wordCount = Arrays.stream(word.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(words -> words, LinkedHashMap::new, Collectors.counting()));
        System.out.println(wordCount);
        // How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object? need example code

        List<String> stringList = Arrays.asList("apple", "banana", "orange");
        // Check if the list is not null and not empty using Optional
        Optional.ofNullable(stringList)
                .filter(list -> !list.isEmpty())
                .ifPresent(list -> list.forEach(System.out::println));
        // If you want to perform a specific operation on each element, you can use map
        Optional.ofNullable(stringList)
                .ifPresent(list -> list.stream().map(String::toUpperCase).forEach(System.out::println));

        // find only duplicate elements with its count from the String ArrayList in Java8?

        List<String> namesList = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> duplicateListCount = namesList.stream()
                .filter(x -> Collections.frequency(nameses,x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(duplicateListCount);
        //Output: - {AA=2}

        //How to count each element/word from the String ArrayList in Java8?
        Map<String,Long> nameCount = namesList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(nameCount);
        //OutPut: {CC=1, BB=1, AA=2}
        //How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Alice", 28));  // Duplicate key

     Map<String,List<Person>> personList = people.stream()
                .collect(Collectors.groupingBy(Person::getName,LinkedHashMap::new,Collectors.toList()));
     System.out.println(personList);
    }
}
