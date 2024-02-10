package com.multiThreading;

import static java.lang.Thread.sleep;

class MyCount extends Thread{
    private int threadNo;

    MyCount(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void countMe () throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println("Thread No: " + threadNo + "and Iteration No "+ i);
        }
    }
}
public class UsingExtending {
    public static void main(String[] args) throws InterruptedException {
        MyCount myCounter = new MyCount(1);
        MyCount myCounter2 = new MyCount(2);
        long startingTime = System.currentTimeMillis();
        System.out.println(startingTime);
        //myCounter.run();
        myCounter.start();
        System.out.println("*************************");
        //myCounter2.run();
        myCounter2.start();
        long endingTime = System.currentTimeMillis();
        System.out.println(endingTime);
        System.out.println("total Time taken :"+ (endingTime - startingTime));
    }
}
