package com.InterviewByMe;

public class Employee {
    private int employeeNumber;
    private double salary;

    public Employee(int employeeNumber, double salary) {
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", salary=" + salary +
                '}';
    }
}
