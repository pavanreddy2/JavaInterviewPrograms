package com.InterviewByMe;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] array = {10,12,8,20,30,5};

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);
    }
}
