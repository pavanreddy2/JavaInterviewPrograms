package com.lambda.realExample;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pavan");
        list.add("anurudh");
        list.add("sunitha");
        list.add("niki");

        for (String s: list){
            System.out.println(s);
        }
        System.out.println();

        list.stream().forEach(s -> System.out.println(s));
    }
}
