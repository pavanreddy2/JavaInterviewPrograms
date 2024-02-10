package com.string;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HighestString {
    public static void main(String[] args) {
        String str1 = "pavankumarReddy";
        String str2 = "pavanKumar";

        String str = (str1.length() > str2.length()) ? str1 : str2;

        String duplicateRemove = removeDuplicate (str);
        System.out.println(duplicateRemove);

        //Using Java8
        String duplicateRemoveUsingJava8 = str.chars()
                .distinct()
                .mapToObj(s -> String.valueOf((char) s))
                .collect(Collectors.joining());

      System.out.println(duplicateRemoveUsingJava8);

      //Count the Duplicate Characters
     Map<Character, Long> countDuplicate =  str.chars()
                .mapToObj( s -> ((char)s))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

     System.out.println(countDuplicate);
    }

    private static String removeDuplicate(String s) {
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

            for (Character ch : s.toCharArray()){
                if (set.add(ch)){
                    stringBuilder.append(ch);
                }
            }
            return stringBuilder.toString();
    }



}
