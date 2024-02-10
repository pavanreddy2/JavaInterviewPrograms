package com.Arrayprogramms;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int length = arr.length;
      int[] revArray =  reverseArray(arr,0,length-1);
      for (int i : revArray) {
          System.out.print(i+ " ");
      }
    }

    public static int[] reverseArray(int[] a, int i, int j){
        if (i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            reverseArray(a,i+1,j-1);
        }
        return a;
    }
}

