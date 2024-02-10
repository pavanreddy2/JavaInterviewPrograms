package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccuranceOfEachCharacter {

    int i = 10; // Instance Variable

    static int i1 = 100; // Static Variable
    public static void main(String[] args) {

        String s = "morning"; // Input Value  // Local Variable ==>

        char[] c = s.toCharArray(); //[

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (Character ch : c){
            if (map.containsKey(ch)){
               Integer in =  map.get(ch);
                map.put(ch,in + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " = "+ entry.getValue());
        }
    }
}
