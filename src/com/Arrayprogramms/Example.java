package com.Arrayprogramms;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 3; // number of elements to rotate

// create a new array to hold the rotated elements
        int[] rotated = new int[n];

// copy the last n elements of the original array to the rotated array
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[arr.length - n + i];
        }

// shift the remaining elements of the original array to the right by n positions
        for (int i = arr.length - 1; i >= n; i--) {
            arr[i] = arr[i - n];
        }

// copy the rotated elements back to the beginning of the original array
        for (int i = 0; i < n; i++) {
            arr[i] = rotated[i];
        }

// print the resulting array
        System.out.println(Arrays.toString(arr));
       /* int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 3; // number of elements to rotate

// create a new array to hold the rotated elements
        int[] rotated = new int[n];

// copy the last n elements of the original array to the rotated array
        System.arraycopy(arr, arr.length - n, rotated, 0, n);

// shift the remaining elements of the original array to the right by n positions
        System.arraycopy(arr, 0, arr, n, arr.length - n);

// copy the rotated elements back to the beginning of the original array
        System.arraycopy(rotated, 0, arr, 0, n);

// print the resulting array
        System.out.println(Arrays.toString(arr));*/
    }
}
