package com;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public String longestCommonPrefix (String[] a){
        if (a.length == 0)
            return "";
        Arrays.sort(a);
        String first = a[0];
        String last  = a[a.length - 1];
        int c = 0;
        while (c < first.length()){
            if (first.charAt(c) == last.charAt(c)){
                System.out.println(first.charAt(c));
                c++;
            } else {
                break;
            }
        }
        return first.substring(0,c);
    }
}

class Employee {
    Long id;
    String name;
    Double salary;
    Integer age;
    Department department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
class Department{
    String location;
    String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Longest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geeker"};
        System.out.println("The longest Common Prefix is : " +
                solution.longestCommonPrefix(input));


        ArrayList<Employee> list = new ArrayList<Employee>();

        list.sort(Comparator.comparing(Employee::getSalary).reversed()
                .thenComparing(Employee::getName));
        list.forEach(System.out::println);

        //Map - Department name as key and List<Employees> as values
        Map<String, List<Employee>> collect = list.stream()
                .filter(emp -> emp != null && emp.getDepartment() != null && emp.getDepartment().getName() != null)
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getName()));

        Map<String, List<Employee>> collect1 = list.stream()
                // Filter out any employees with null departments or department names
                .filter(emp -> Optional.ofNullable(emp)
                        .map(Employee::getDepartment)
                        .map(Department::getName)
                        .isPresent())
                // Collect employees, grouping them by department name
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getName()));

    }
}
