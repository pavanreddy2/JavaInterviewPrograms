package com.InterviewByMe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfWord {
    public static void main(String[] args) {
        String s=" This is my house that is your house  ";

        String[] split = s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String word: split){
            if (map.containsKey(word)){
                Integer i = map.get(word);
                map.put(word, i+1);
            } else {
                map.put(word,1);
            }
        }

        for (Map.Entry<String,Integer> entrySet: map.entrySet()){
            System.out.println(entrySet.getKey()+ " "+ entrySet.getValue());
        }

        //
        Map<String, Long>  wordOccurance = Arrays.stream(s.split("\\s+"))
                .collect (Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordOccurance);
    }
}
