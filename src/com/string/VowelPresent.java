package com.string;

public class VowelPresent {
    public static boolean isVowelPresent(String input){
        String isVowel = "aeiouAEIOU";
            for (int i = 0;i<input.length();i++){
                char c = input.charAt(i);
                if (isVowel.indexOf(c) != -1){
                    return true;
                }
            }

        return false;
    }

    public static void main(String[] args) {
            String input1 = "zzz";
            System.out.println("Input String :"+ input1);
            System.out.println("Vowel Present: "+isVowelPresent(input1));

    }
}
