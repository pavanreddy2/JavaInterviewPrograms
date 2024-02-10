package com.InterviewByMe;

import java.time.LocalDate;

public class Employee3 {
    private String name;
    private double salary;
    private Gender gender;
    private LocalDate localDate;

    public Employee3(String name, double salary, LocalDate localDate, Gender gender) {
        this.name = name;
        this.salary = salary;
        this.localDate = localDate;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", localDate=" + localDate +
                '}';
    }
}
