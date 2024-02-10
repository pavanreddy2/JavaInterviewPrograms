package com.lambda.realExample;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

    public List<Employee> getEmployeeDetails() {
        EmployeeDao employeeDao = new EmployeeDao();
       return employeeDao.getEmployee().stream().filter(e -> e.geteSalary()> 85000).collect(Collectors.toList());
    }
    public List<Employee> getEmployeeDetailsAddSalary () {
        EmployeeDao employeeDao1 = new EmployeeDao();
     return  employeeDao1.getEmployee()
                .stream().map(e -> {
             if (e.geteSalary() > 80000d){
                 e.seteSalary(e.geteSalary() * 1.10);
             }
             return e;
        }).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        StreamApiExample streamApiExample = new StreamApiExample();
        System.out.println(streamApiExample.getEmployeeDetails());

        System.out.println();

        System.out.println(streamApiExample.getEmployeeDetailsAddSalary());
    }
}
