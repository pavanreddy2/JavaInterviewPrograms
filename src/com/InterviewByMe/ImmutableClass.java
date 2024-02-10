package com.InterviewByMe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableClass {
    public static void main(String[] args) {
        List<EmployeeImm> list = new ArrayList<>();
        EmployeeImm em1 = new EmployeeImm(101,"pavan");

        EmployeeImm em2 = new EmployeeImm(102,"reddy");

        list.add(em1);
        list.add(em2);
        System.out.println(list);


    }
}
