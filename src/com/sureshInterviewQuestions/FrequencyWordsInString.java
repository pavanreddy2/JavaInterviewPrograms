package com.sureshInterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyWordsInString {
    public static void main(String[] args) {
        String str = "java is programming and Java is applicable";
        String[] words = str.toLowerCase().split(" ");
        Map<String, Long> collect = Arrays.stream(words)
                            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(collect);
        collect.entrySet().stream()
                .sorted((w1, w2) -> Long.compare(w2.getValue(), w1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey()+ " "+ entry.getValue()));
    }
}
