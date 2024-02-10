package com.Arrayprogramms;

import java.util.HashSet;

public class MissingNumbersfrom1to10InArray {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,8,9,10};
        findMissingNumber(arr);

    }


    public static void findMissingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();


        for (int num : arr) {
            set.add(num);
        }
       // System.out.println(set);
        int a = arr.length + 1;
        for (int i = 0; i < a; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }

        }

    }

}
