package com.allProgrammes;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"pavan");
        map.put(2,"kumar");
        map.putIfAbsent(1,"aaaa");

        System.out.println(map);

        System.out.println(map.get(3));
    }
}
