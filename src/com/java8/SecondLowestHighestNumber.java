package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {
       List<Integer> list =  Arrays.asList(0,2,3,4,5,11,23,34,52,43,22,4497,76);
      int secH =  list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
      System.out.println(secH);

      //finding Second Lowest Number
     int secL =   list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
     System.out.println(secL);
    }

}
