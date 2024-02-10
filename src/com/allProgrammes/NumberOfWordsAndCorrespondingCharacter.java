package com.allProgrammes;

import java.util.Arrays;

public class NumberOfWordsAndCorrespondingCharacter {
    public static void main(String[] args) {
        String str = "Hello World";

     int wordCount = countWords(str);
       int characterCount =  countSentence (str);
        System.out.println(wordCount);
        System.out.println(characterCount);

    }

    private static int countWords(String str) {
        return (int) Arrays.stream(str.split(" ")).filter(words -> !words.isEmpty()).count();
    }
    private static int countSentence(String str) {
        return str.length();
    }

}
