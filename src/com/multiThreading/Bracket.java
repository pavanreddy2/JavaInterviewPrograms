package com.multiThreading;

class Example {

    public void m1() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                if (i <= 10) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
        }
        for (int i = 0; i < 20; i++) {
           Thread.sleep(100);
        }

        System.out.println();
    }
}

public class Bracket {
    public static void main(String[] args) {
        Example example = new Example();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        example.m1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        example.m1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
