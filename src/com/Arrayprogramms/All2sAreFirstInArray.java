package com.Arrayprogramms;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class All2sAreFirstInArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 1, 3, 2, 1, 2, 3, 2,3,4,5,6,2};

        int left = 0;
        int right = a.length - 1;

        System.out.println(right);
        while (left < right) {
            if (a[left] == 2) {
                left++;
            } else if (a[right] == 2) {
                // Swap a[left] and a[right]
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else {
                right--;
            }
        }

        System.out.println(Arrays.toString(a));

        System.out.println("Java 8 features ");

        int[] result = Arrays.stream(a)
                .boxed()
                .sorted((x, y) -> Integer.compare(x == 2 ? 0 : 1, y == 2 ? 0 : 1))
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(result));



    }
}
