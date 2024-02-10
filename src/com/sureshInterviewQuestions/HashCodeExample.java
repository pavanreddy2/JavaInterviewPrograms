package com.sureshInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HashCodeExample {
    public static void main(String[] args) {

        Student s1 = new Student(101,"Pavan");
        Student s2 = new Student(102,"Anurudh");
        Student s3 = new Student(102,"Anurudh");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        Map<Student,String> map = new HashMap<>();
        map.put(s1,"B");
        map.put(s2,"A");

        System.out.println(map);

        String grade = map.get(new Student(101, "Pavan"));
        System.out.println(grade);
    }
}
