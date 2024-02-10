package com.java8Techie.MapAndReduce;

import com.lambda.realExample.EmployeeDao;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,7,8,9,10);

        int sum = 0;
        for (Integer i : list){
            sum = sum + i;
        }
        System.out.println(sum);

        //Using Java8
       int i1 = list.stream().mapToInt(i -> i).sum();
       System.out.println(i1);
       //using Reduce ()
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        //Using MethodReference
        Optional<Integer> methodReferenceWithOptional = list.stream().reduce(Integer::sum);
        System.out.println(methodReferenceWithOptional.get());
        //Multiple by 1 using reduce method
        Integer mulResult = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);
        Integer maxResult = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxResult);
        Integer maxValueWithMethodReference= list.stream().reduce(Integer::max).get();
        System.out.println(maxValueWithMethodReference);

        List<String> words = Arrays.asList("java","Springboot","hibernate");
       String logestString = words.stream().reduce((word1,word2) ->word1.length()>word2.length() ? word1:word2).get();
       System.out.println(logestString);
       //get Employee Salary whose grade A

        EmployeeDao employeeDao = new EmployeeDao();
     double avgSalary = employeeDao.getEmployee().stream()
                .filter(employee -> employee.geteName().startsWith("A"))
                .map(employee -> employee.geteSalary())
                .mapToDouble(i-> i)
                .sum();
                //.average().getAsDouble();
     System.out.println(avgSalary);
    }

}
