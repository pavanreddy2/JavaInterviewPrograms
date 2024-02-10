package com.lambda.realExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5,7,4);
        Collections.sort(list);//Ascending Order
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employee = employeeDao.getEmployee();

        Collections.sort(employee,new MyComparator());
        System.out.println(employee);

      /*  Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.geteSalary() - o2.geteSalary());
            }
        });*/

        //Collections.sort(employee, (o1, o2) -> (int) (o1.geteSalary() - o2.geteSalary()));

        //employee.stream().sorted((o1,o2) -> (int) (o1.geteSalary() - o2.geteSalary())).forEach(s -> System.out.println(s));
        // we can optimize the code
       // employee.stream().sorted(Comparator.comparing(emp -> emp.geteSalary())).forEach(e -> System.out.println(e));
        employee.stream().sorted(Comparator.comparing(Employee::geteName)).forEach(e -> System.out.println(e));


/*        list.stream().sorted().forEach(s -> System.out.println(s));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));*/
    }
}
class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.geteName().compareTo(o2.geteName());
    }
}
