package com.multiThreading;

import java.util.Random;

import static java.lang.Thread.sleep;

/*class countRun implements Runnable{

    private int threadNo;

    public countRun(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Random random = new Random();
                sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread No : "+ threadNo +" "+ "Iteration No :"+ i);
        }
    }
}*/
public class UsingRunnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }).start();

    }
}
