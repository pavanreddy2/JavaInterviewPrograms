package com.string;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachWord {
    public static void main(String[] args) {

        String str = "Hello world, how are you today? Are you feeling good?";

        String[] words = str.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {

                Integer count = wordCount.get(word);
                wordCount.put(word,count + 1);
            } else {
                wordCount.put(word,1);
            }
        }

        for (Map.Entry<String,Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " ="+ entry.getValue());
        }
    }
}
