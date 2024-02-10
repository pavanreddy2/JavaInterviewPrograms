package com.allProgrammes;

public class Employee {
    private int salary;
    private int age;

    private String department;

    public Employee(int salary, int age,String department) {
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
