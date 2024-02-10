package com.allProgrammes;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        String s = "abcdabcbb";
        System.out.println(longestSubStringWithoutRepeating(s));

    }

    public static int  longestSubStringWithoutRepeating(String s){
        if (s.length() == 0 )
            return 0;
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
