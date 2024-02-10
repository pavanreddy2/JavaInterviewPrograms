package com.string;

public class ReverseEachWordOfString {
    public static void main(String[] args) {

        String input = "java code";
        System.out.println("Original String :" + input);

        String[] words = input.split(" ");

        String output = " ";
        for (String word : words){
            String reverseWord= "";
            for (int i = word.length() - 1; i>=0;i--){
                reverseWord = reverseWord+word.charAt(i);
            }
            output = output + reverseWord+ " ";
        }
        System.out.println(output);

      /*  String[] words = input.split(" ");
        String output = "";
        for (String word : words) {
            String reverserWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverserWord = reverserWord + word.charAt(i);
            }
            output = output + reverserWord + " ";
        }
        System.out.println(output);*/
    }
}
