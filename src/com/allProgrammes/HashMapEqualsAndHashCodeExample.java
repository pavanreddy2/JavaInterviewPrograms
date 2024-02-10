package com.allProgrammes;

import java.util.HashMap;
import java.util.Map;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HashMapEqualsAndHashCodeExample {
    public static void main(String[] args) {

        Student s1 = new Student(1,"abc");
        Student s2 = new Student(1,"abc");
        Student s3 = new Student(1,"abc");
        Student s4 = new Student(1,"abc");

        Map<Student,String> map = new HashMap<>();
        map.put(s1,"First");
        map.put(s2,"Second");
        map.put(s3,"Third");
        map.put(s4,"Fourth");
        System.out.println(map.size());
    }
}
