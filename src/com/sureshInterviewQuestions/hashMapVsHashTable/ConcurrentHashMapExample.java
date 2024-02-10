package com.sureshInterviewQuestions.hashMapVsHashTable;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        // Adding key-value pairs to the ConcurrentHashMap
        concurrentHashMap.put(1, "Value 1");
        concurrentHashMap.put(2, "Value 2");
        concurrentHashMap.put(3, "Value 3");

        // Simulate multiple threads accessing the ConcurrentHashMap
        Runnable task = () -> {
            for (int i = 1; i <= 1000; i++) {
                String value = concurrentHashMap.get(i);
                System.out.println("Thread " + Thread.currentThread().getId() + " retrieved: " + value);
            }
        };

        // Create multiple threads to run the task
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
