package com.InterviewByMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, 60000));
        employees.add(new Employee(102, 45000));
        employees.add(new Employee(103, 70000));
        employees.add(new Employee(104, 55000));


      Map<Integer,Employee> employeeFilter =   employees.stream().filter(e1 -> e1.getEmployeeNumber() % 2 == 0 && e1.getSalary() > 50000)
                .collect(Collectors.toMap(Employee::getEmployeeNumber,employee -> employee));


        System.out.println(employeeFilter);



    }
}
