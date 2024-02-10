package com.walmart;

import java.sql.Array;
import java.util.*;

public class CustomizedSortingHashMap {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Orange", 8);
        unsortedMap.put("Mango", 3);

        //Convert HashEntities into List

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

        // Custom sorting logic (sorting by values in descending order)
        entryList.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Construct a new LinkedHashMap with sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted Map
        System.out.println("Sorted Map: " + sortedMap);

    }
}
