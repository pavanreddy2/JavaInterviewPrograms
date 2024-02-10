package com.sureshInterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "john@example.com"));
        employees.add(new Employee("Alice", "alice@company.com"));
        employees.add(new Employee("Bob", "bob@gmail.com"));
        employees.add(new Employee("Eve", "eve@example.org"));
        employees.add(new Employee("Charlie", "charlie"));

      List<Employee> employeesList =   employees.stream().filter(e1 -> e1.getEmail() != null && e1.getEmail().contains("@"))
                .collect(Collectors.toList());
        long emailUsersCount =  employeesList.stream().count();
        System.out.println(emailUsersCount);
         System.out.println(employeesList);
    }
}
