package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 5, 8, 9, 9};
        int count = 2; // find elements that appear exactly twice

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        // count the occurrence of each element in the array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        // find the duplicate elements with the given count
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            if (frequency == count) {
                duplicates.add(element);
            }
        }

        // print the duplicate elements
        System.out.println("Duplicate elements that appear " + count + " times:");
        for (int element : duplicates) {
            System.out.print(element + " ");
        }

    }
}
