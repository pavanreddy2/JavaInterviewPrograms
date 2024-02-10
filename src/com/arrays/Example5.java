package com.arrays;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 2, 1, 2, 3, 2, 3, 4, 5, 6, 2};

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (a[left] == 2) {
                left++;
            } else {
                while (right > left && a[right] != 2) {
                    right--;
                }

                if (right > left) {
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    left++;
                    right--;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
