package com.multiThreading;

public class SynchronizationExample {
    public static int counter = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    SynchronizationExample.counter++;
                }
                System.out.println("The loop in thread2 is over");
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    SynchronizationExample.counter++;
                }
                System.out.println("The loop in thread2 is over");
            }
        }).start();

        System.out.println(counter);
    }
}
