package com.java8FullCourse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleCode {
    public static void main(String[] args) {
        //EvenNumber
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
       List<Integer> evenNumbers = list.stream().filter (a -> a% 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //NumberStartingWithOne
      List<String> numberWithOne =  list.stream()
                .map(num -> num + "") //Convert Integer with String
                .filter(num -> num.startsWith("1"))
                .collect(Collectors.toList());
      System.out.println(numberWithOne);

      //Find the Duplicate Elements
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicate = myList.stream().filter(s -> !set.add(s))
                .collect(Collectors.toList());
        System.out.println(duplicate);

        //Find First Element in List
        // Check for null before using the stream
        if (myList != null) {
            Optional<Integer> firstElement = myList.stream().findFirst();
            firstElement.ifPresent(System.out::println);
        } else {
            System.out.println("List is null");
        }
        //find the total number of elements present in the list
       Long count = myList.stream().collect(Collectors.counting());
        System.out.print(count);
        System.out.println();
        // find the maximum value element present in it using Stream functions?
        Integer maxNumber = myList.stream().max(Integer::compare).get();
        System.out.println(maxNumber);
        //find the first non-repeated character in it using Stream functions?
        System.out.println();
        String input = "Java articles are Awesome";
      Character result =   input.chars() //Stream of chars
                .mapToObj(c -> Character.toLowerCase((char)c))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println(result);

        //find the first repeated character in it using Stream functions?
        String input1 = "Java articles are Awesome";
      Character repeatedCharacter =  input1.chars()
                 .mapToObj(c -> Character.toLowerCase((char) c))
                 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() > 1L)
                 .map(entry -> entry.getKey())
                 .findFirst()
                 .get();
         System.out.println(repeatedCharacter);
         //Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
       List<Integer> sorted = myList1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
       System.out.println(sorted);
        System.out.println();
       //Boxing Example
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> integerList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("List of boxed integers: " + integerList);
        //How will you get the current date and time using Java 8 Date and Time API?
        System.out.println("Current Local Date :"+ LocalDate.now());
        System.out.println("Current Local Time :"+ LocalTime.now());
        System.out.println("Current Local DateTime :"+ LocalDateTime.now());

        System.out.println();
        //Write a Java 8 program to concatenate two Streams?

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        List<String> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println();
        //Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerListCube = Arrays.asList(4,5,6,7,1,2,3);
        List<Integer> filter = integerListCube.stream()
                        .map(i -> i*i*i)
                                .filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(filter);
        System.out.println();
        //Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(n -> System.out.println(n + " "));

        //How to use map to convert object into Uppercase in Java 8?
        List<String> nameList = Arrays.asList("aa","bb","cc");
                                                    //map (a -> a.upperCase())
       List<String> upperCase =  nameList.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
       System.out.println(upperCase);

        //Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct.
        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));

        String str = "java";
         Map<Character,Long> collect1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println(collect1);
    }
    public static boolean containsDuplicate(int[] nums) {
       List<Integer> list =  Arrays.stream(nums)
                                .boxed()
                                    .collect(Collectors.toList());
       Set<Integer> set = new HashSet<>(list);
       if (set.size() == list.size()){
           return false;
       }
       return true;
    }
}
