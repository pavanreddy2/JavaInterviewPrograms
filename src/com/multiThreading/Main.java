package com.multiThreading;

import static java.lang.Thread.sleep;

class MyCounter {
    private int threadNo;

    MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    public void countMe () throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(1000);
            System.out.println("Thread No: "+ threadNo + "and Iteration No "+ i);
        }
    }

}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter(1);
        MyCounter myCounter2 = new MyCounter(2);
        long startingTime = System.currentTimeMillis();
        System.out.println(startingTime);
        myCounter.countMe();
        System.out.println("*************************");
        myCounter2.countMe();

        long endingTime = System.currentTimeMillis();
        System.out.println(endingTime);
        System.out.println("total Time taken :"+ (endingTime - startingTime));
    }
}
