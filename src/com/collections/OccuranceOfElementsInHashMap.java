package com.collections;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElementsInHashMap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 5, 8, 9, 9};

        Map<Integer, Integer> elementCounts = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (elementCounts.containsKey(element)) {
                elementCounts.put(element, elementCounts.get(element) + 1);
            } else {
                elementCounts.put(element, 1);
            }
        }

        // Print the occurrence of each element
        for (Map.Entry<Integer, Integer> entry : elementCounts.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > 1)
            System.out.println("Element " + element + " occurs " + frequency + " times");
        }
    }
}
