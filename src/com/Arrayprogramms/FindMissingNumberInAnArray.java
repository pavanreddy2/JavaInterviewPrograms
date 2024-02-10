package com.Arrayprogramms;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {

   /*     int[] arr = {1,2,3,4,5,6,7,8,9,11};
        int n = arr.length + 1;

        int sum = (n * (n+1))/2;

        for (int i =0;i<arr.length;i++){
            sum = sum - arr[i];
        }
        System.out.println(sum);*/

        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        HashSet<Integer> set = new HashSet<>();
        for (int i1 : arr){
            set.add(i1);
        }
        System.out.println(set);
        int num = arr.length + 1;
        for (int i= 1;i<=num;i++){
            if (!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
