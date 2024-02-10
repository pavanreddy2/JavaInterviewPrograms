package com.multiThreading;

class sharedCenter {
    private int count = 0;

    //Synchronized method to increment the count
    synchronized public void incrementCount () {
        count ++;
        System.out.println(Thread.currentThread().getName() + "  "+ count);
    }
}
public class SynchronizedExample {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i= 0; i < 10; i++){

                }
            }
        });
    }
}
