package com.sureshInterviewQuestions.hashMapVsHashTable;

import java.util.Hashtable;

public class HashtableThreadSafetyExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put(1, "Value 1");
        hashtable.put(2, "Value 2");
        hashtable.put(3, "Value 3");

        // Simulate multiple threads accessing the Hashtable
        Runnable task = () -> {
            for(int i = 1; i <=1000 ;i++){
                String value = hashtable.get(i);
                System.out.println("Thread"+ Thread.currentThread().getId() + "retrived: "+ value);
            }
        };

        // Create multiple threads to run the task
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

    }
}
