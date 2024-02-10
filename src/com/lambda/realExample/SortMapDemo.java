package com.lambda.realExample;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"pavan");
        map.put(2,"anurudh");
        map.put(3,"sunitha");
        map.put(4,"chakri");
        map.put(5,"madhu");

        //Traditional Ways
        // if we do Collections.sort() then it will always expecting the List.
        //Now How we can get the List from the Map. We can do get the EntrySet from the map and the Add into the List.

        //List<Map.Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
        /*Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<Integer,String> map1 : entries) {
            System.out.println(map1.getKey() + " "+ map1.getValue());
        }*/
        //Using Lambda Expression
/*        List<Map.Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,((o1, o2) -> o1.getValue().compareTo(o2.getValue())));
        for (Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }*/
        //Using Stream API
        List<Map.Entry<Integer, String>> entry = map.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .collect(Collectors.toList());
        System.out.println(entry);
        //Using another Way
        System.out.println();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(s -> System.out.println(s));
    }
}
