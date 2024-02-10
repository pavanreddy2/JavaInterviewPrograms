package com.allProgrammes;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsExamples {
    public static void main(String[] args) {
        String str = "Hello World, I am from India";

        char[] chars = str.toCharArray();

        int count = 0;
       // Set<Character> set = new HashSet<>();
        for (Character ch : chars){
            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                //set.add(ch);
               count++;

            }

        }
        //int size = set.size();
        System.out.println(count);
    }
}
