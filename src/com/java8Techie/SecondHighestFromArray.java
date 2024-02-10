package com.java8Techie;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestFromArray {
    public static void main(String[] args) {
        int [] arr = {20,30,311,300,44,556};
   Integer secondHighestNumber =  Arrays.stream(arr)
                                    .boxed()
                                        .sorted(Comparator.reverseOrder()).
                                            skip(1)
                                                .findFirst().get();
   System.out.println(secondHighestNumber);

 /*       int i = 100;
        Integer i1 = i;

        System.out.println(i1);

        Integer i2 = 22;
        int i3 = i2;

        System.out.println(i3);*/
    }
}
