package com.Arrayprogramms;

public class DuplicatesElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,2,4,3,5,67,7,8,9};
        System.out.println("Duplicates elements in given Array");
        //search for duplicates elements
        for (int i = 0; i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
