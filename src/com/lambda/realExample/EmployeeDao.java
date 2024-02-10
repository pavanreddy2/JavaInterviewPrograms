package com.lambda.realExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public List<Employee> getEmployee (){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"pavan",90000d));
        employeeList.add(new Employee(102,"Anurudh",100000d));
        employeeList.add(new Employee(103,"sunitha",850000d));
        employeeList.add(new Employee(104,"sena",80000d));
        employeeList.add(new Employee(105,"madhu",890000d));
        employeeList.add(new Employee(106,"Anu",98000d));
        return employeeList;
    }


}
