package com.java8Techie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {
        String str = "ilovejavatechie";

          //String[] result =  str.split("");
          //System.out.println(Arrays.toString(result));
          //O/P : [i, l, o, v, e, j, a, v, a, t, e, c, h, i, e]
        // Here String is converting to the String Array by considering Each character as a element
        //Map<String, List<String>> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(a -> a));
        //{a=[a, a], c=[c], t=[t], e=[e, e, e], v=[v, v], h=[h], i=[i, i], j=[j], l=[l], o=[o]}
         Map<String, Long> map = Arrays.stream(str.split(""))
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println(map);
         //Function.identity(),Collectors.counting()) ==>
        //It will take the HashMao , and it will do the check if key is present then get the number of count and add by 1.
    }
}
