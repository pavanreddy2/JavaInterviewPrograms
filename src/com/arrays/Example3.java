package com.arrays;

public class Example3 {
    public static void main(String[] args) {
        int count = 0;
        int a[] = new int [5];
        for (int i = 0; i <=4;i++){
            a[i] = i * 10;
            count = count + a[i];
        }
        System.out.println("Count of array is:"+count);
    }
}
