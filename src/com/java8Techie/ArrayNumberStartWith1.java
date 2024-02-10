package com.java8Techie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayNumberStartWith1 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 11, 2, 8, 21, 1};
         List<String> list =  Arrays.stream(arr)
                                    //converting primitive to Wrapper class
                                    .boxed()
                                        //Converting arr to String then only we can validate StartsWith
                                        .map(a -> a + "")
                                            .filter(a -> a.startsWith("1"))
                                                 .collect(Collectors.toList());
          System.out.println(list);
    }
}
