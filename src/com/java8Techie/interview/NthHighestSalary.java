package com.java8Techie.interview;


import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {

        Map<String,Double> map = new HashMap<>();
        map.put("pavan",500000d);
        map.put("anurudh",900000d);
        map.put("daniel",30000d);
        map.put("sunitha",90000d);
        map.put("sena",450000d);

/*        List<Map.Entry<String, Double>> collect = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toList());
        System.out.println(collect);*/

        Map.Entry<Double, List<String>> doubleListEntry = map.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet()
                .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(1);
        System.out.println(doubleListEntry);


    }
}
