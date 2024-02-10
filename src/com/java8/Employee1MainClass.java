package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee1MainClass {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", "developer", 15000));
        employees.add(new Employee1("Alice", "developer", 18000));
        employees.add(new Employee1("Bob", "manager", 25000));
        employees.add(new Employee1("David", "developer", 22000));
        employees.add(new Employee1("Eva", "developer", 19000));

        List<Employee1> filteredEmployees = employees.stream()
                .filter(e -> e.getRole().equals("developer") && e.getSalary() < 20000)
                .map(e -> new Employee1(e.getName(), e.getRole(), e.getSalary() * 1.1)) // Calculate the new salary with 10% hike
                .sorted(Comparator.comparing(Employee1::getName)) // Sort the employees by name
                .collect(Collectors.toList()); // Collect the filtered and sorted employees into a list

        System.out.println(filteredEmployees);
        // Print the filtered employees
   /*     for (Employee1 e : filteredEmployees) {
            System.out.println(e.getName() + " " + e.getRole() + " " + e.getSalary());
        }*/
    }
}
