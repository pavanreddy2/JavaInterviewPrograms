package com.InterviewByMe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee3Main {
    public static void main(String[] args) {

        List<Employee3> employees = new ArrayList<>();
        employees.add(new Employee3("Alice", 55000, LocalDate.of(2021, 3, 15), Gender.FEMALE));
        employees.add(new Employee3("Bob", 48000, LocalDate.of(2019, 5, 10), Gender.MALE));
        employees.add(new Employee3("Charlie", 52000, LocalDate.of(2022, 2, 28), Gender.FEMALE));
        employees.add(new Employee3("David", 49000, LocalDate.of(2020, 8, 7), Gender.MALE));

       List<Employee3> employeefilter =  employees.stream()
                .filter(e -> e.getSalary() > 50000 && e.getGender() == Gender.FEMALE &&
                        e.getLocalDate().isAfter(LocalDate.of(2020,12,31)))
                .collect(Collectors.toList());

       System.out.println(employeefilter);

       Map<Employee3,Gender> employee3StringMap =  employees.stream()
                .filter(e -> e.getSalary() > 50000 && e.getGender() == Gender.FEMALE &&
                        e.getLocalDate().isAfter(LocalDate.of(2020,12,31)))
                .collect(Collectors.toMap(e -> e, Employee3::getGender));

       employee3StringMap.forEach((employee, gender)->
               System.out.println(employee.getName()+" = "+employee.getGender()));
    }
}
