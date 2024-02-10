package com.InterviewByMe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainEmployee2 {
    public static void main(String[] args) {
        List<Employee2> employeesList = Arrays.asList(new Employee2(1,"pavan", 25, 700000),
                new Employee2(2,"pavan",  22, 8000000),
                new Employee2(3,"anurudh", 24, 9600000));

        Map<Employee2, Long> duplicateCount = employeesList.stream()
                .collect(Collectors.groupingBy(Employee2::getName, Collectors.toSet())) // Group Employees by name
                .entrySet().stream()
                .filter(e -> e.getValue().size() > 1) // Filter groups with more than one Employee
                .flatMap(e -> e.getValue().stream()) // Flatten to Stream<Employee>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Count duplicates

        System.out.println(duplicateCount);
    }
}
