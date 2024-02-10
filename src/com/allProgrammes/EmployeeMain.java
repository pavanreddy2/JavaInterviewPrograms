package com.allProgrammes;


import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
       List<Employee> employees = Arrays.asList(
               new Employee(50000,30, "HR"),
               new Employee(60000,25,"Financial"),
               new Employee(70000,40, "HR"),
               new Employee(80000,35,"Engineer"),
               new Employee(50000,50,"HR")
               );

     Optional<Integer> thirdHighestSalary = employees.stream()
               .map(Employee::getSalary)
               .distinct()
               .sorted(Comparator.reverseOrder())
               .skip(2)
               .findFirst();

        OptionalInt max = employees.stream()
                .mapToInt(Employee::getAge)
                .max();
       System.out.println(thirdHighestSalary);
       System.out.println(max);

      List<Employee> listofEmployees =  employees.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("HR"))
               .collect(Collectors.toList());

      System.out.println(listofEmployees);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "grape", "kiwi"),
                Arrays.asList("melon", "pineapple", "strawberry")
        );

        System.out.println(listOfLists);
        List<String> list = listOfLists.stream().flatMap(List::stream)

                .collect(Collectors.toList());
        System.out.println(list);
    }
}
