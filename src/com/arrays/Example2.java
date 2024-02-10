package com.arrays;

public class Example2 {
    public static void main(String[] args) {
        int a[] = new int [5];  // 0,1,2,3,4

        for (int i = 0; i<=4;i++){
              a[i] = i * 10;  // 0, 10,20,30,40
        }
        System.out.println(a[3]);
    }
}
