package com.java8FullCourse;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDetailsMian {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

    //Find out the count of male and female employees present in the organization?

       Map<String,Long> countOfMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(countOfMaleAndFemale);

       //Write a program to print the names of all departments in the organization.
       List<String> department = employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
       System.out.println(department);
       //Find the average age of Male and Female Employees.
       Map<String,Double> avgAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
       System.out.println(avgAge);
       //Get the Names of employees who joined after 2015 and year of Joining.
        Map<String,Integer> joined =employeeList.stream()
                .filter(a -> a.getYearOfJoining() > 2015)
                .collect(Collectors.toMap(Employee::getName,Employee::getYearOfJoining));
        System.out.println(joined);

        //Find out the highest experienced employees in the organization
       Optional<Employee> higestExp = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
       Employee employee = higestExp.get();
       System.out.println("Employee Details");
       System.out.println(employee.getAge());
       System.out.println(employee.getYearOfJoining());
       System.out.println(employee.getName());
       System.out.println();
       // List down the employees of each department
     Map<String,List<Employee>> empList =  employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    Set<Map.Entry<String,List<Employee>>>  entrySet = empList.entrySet();
        for (Map.Entry<String,List<Employee>> entry: entrySet){
            System.out.println("-----------------");
            System.out.println("EMployee In "+ entry.getKey());
            List<Employee> value = entry.getValue();
            for (Employee e :value){
                System.out.println(e.getName());
            }
        }
        System.out.println();
        // Find out the average and total salary of the organization.
        DoubleSummaryStatistics avgSalary = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(avgSalary.getAverage());
        System.out.println(avgSalary.getSum());

        // Find out the oldest employee, his/her age and department?
        System.out.println();
        Optional<Employee> max = employeeList.stream()
                .max(Comparator.comparing(Employee::getAge));
        Employee employee1 = max.get();
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.department);
    }
}
