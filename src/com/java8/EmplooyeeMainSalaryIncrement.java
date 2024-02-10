package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmplooyeeMainSalaryIncrement {
    public static void main(String[] args) {
     List<Employee> list = Arrays.asList(new Employee("pvan",24,50000,"Banaglaore"),
                new Employee("sunitha",22,400000,"Hyderabad"),
                new Employee("subbu",32,40000,"Pune"),
                new Employee("hanu",50,500000,"Bangalore"));
     System.out.println(list);

   List<Employee> incrementSalary =  list.stream().map(e-> {
            if (e.getAge() > 23) {
                e.setSalary(e.getSalary() * 1.10);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println(incrementSalary);


        System.out.println("**********Employee Location and Salary Filter***************");
        //Employee Belongs to Bangalore and Salary is greater than 450000;
        List<Employee> locationFilter = list.stream().filter(e -> e.getLocation().equals("Bangalore") && e.getSalary() > 50000).collect(Collectors.toList());
        System.out.println(locationFilter);

        System.out.println("***********Compare Name and Salary is Highest to Lowerest**************");

        List<Employee> salaryHighestToLower = list.stream().sorted(Comparator.comparing(Employee::getName).
                thenComparing(Comparator.comparing(Employee::getSalary)).reversed()).
                collect(Collectors.toList());
        System.out.println(salaryHighestToLower);
    }

}

