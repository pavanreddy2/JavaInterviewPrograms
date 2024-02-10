package com.lambda.realExample;

public class Employee {

    private int id;
    private String eName;
    private double eSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public Employee(int id, String eName, double eSalary) {
        this.id = id;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }
}
