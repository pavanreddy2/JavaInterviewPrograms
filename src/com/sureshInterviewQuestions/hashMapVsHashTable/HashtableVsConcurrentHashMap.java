package com.sureshInterviewQuestions.hashMapVsHashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashtableVsConcurrentHashMap {
    public static void main(String[] args) {

        final int numberOfThread = 10;
        final int numberOfIteration = 1000;

        Hashtable<Integer,Integer > hashtable = new Hashtable<>();
        runTest(hashtable,numberOfThread,numberOfIteration);

        ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        runTest(hashtable,numberOfThread,numberOfIteration);
     }

    static void runTest (final Map<Integer,Integer> map,int numberOfThread, int numberOfIteration){
        Runnable task = () -> {
            for (int i = 0;i<=numberOfIteration;i++){
                map.put(i,i);
            }
        };

        long startTime = System.currentTimeMillis();
        Thread[] thread = new Thread[numberOfThread];
        for (int i=0;i<numberOfThread;i++){
            thread[i] = new Thread(task);
            thread[i].start();
        }
        for (int i = 0;i<=numberOfThread;i++){
            try{
                thread[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
