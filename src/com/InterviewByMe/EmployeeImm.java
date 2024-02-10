package com.InterviewByMe;

public final class EmployeeImm {

    private final int id;
    private final String name;

    public EmployeeImm(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmployeeImm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
