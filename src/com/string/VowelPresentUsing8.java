package com.string;

import java.util.Arrays;
import java.util.List;

public class VowelPresentUsing8 {

    public static boolean isVowelPresent (String input){
        String vowels = "aeiouAEIOU";
        return input.chars()
                .mapToObj(ch -> (char) ch)
                .anyMatch(ch -> vowels.indexOf(ch) != -1);
    }
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("Hello World", "zz");
        inputs.forEach(input -> {
            System.out.println("Input: " + input);
            System.out.println("Vowel Present: " + isVowelPresent(input));
            System.out.println();
        });

    }
}
