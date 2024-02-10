package com.Arrayprogramms;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int[] arr = {2,30,43,53,67,23,65,78,230};


        Arrays.sort(arr);
        //0 1  2  3  4  5  6   7  8  ==>Index
        //2,23,30,43,54,65,67,78,230
       System.out.println(arr[arr.length-4]); //length-2 ==> 9 - 2 = 7;


    }
}
