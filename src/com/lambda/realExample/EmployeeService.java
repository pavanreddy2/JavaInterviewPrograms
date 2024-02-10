package com.lambda.realExample;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    /*  @Override
    (o1,o2) -> o1.geteName().compareTo(o2.geteName());

 });*/
    public List<Employee> getEmployeeService () {
        List<Employee> employees = new EmployeeDao().getEmployee();
        //Collections.sort(employees, new Comparator<Employee>() {

          /*  @Override
            public int compare(Employee o1, Employee o2) {
                return o1.geteName().compareTo(o2.geteName());
            }
        });*/
          Collections.sort(employees,(o1, o2) -> o1.geteName().compareTo(o2.geteName()));
        return employees;
    }
    public static void main(String[] args) {
        System.out.println(new EmployeeService().getEmployeeService());
    }
}
/*class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.geteName().compareTo(o2.geteName());
    }
}*/
