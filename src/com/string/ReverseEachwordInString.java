package com.string;

public class ReverseEachwordInString {
    public static void main(String[] args) {
        String s = "java is a programming";
        String[] words = s.split(" ");

        String reverseStr = "";
        for (String word: words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i>= 0; i--){
                    reverseWord = reverseWord + word.charAt(i);
            }
            reverseStr = reverseStr + reverseWord + " ";
        }

        System.out.println(reverseStr);

     /*   String original = "Hello, World!";
        String reversed = reverseWords(original);
        System.out.println(reversed); // Output: olleH, dlroW!
    }
    public static String reverseWords(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i)) || i == str.length() - 1) {
                int end = i == str.length() - 1 ? i + 1 : i;
                int j = end - 1;
                while (j >= start) {
                    sb.append(str.charAt(j));
                    j--;
                }
                if (i != str.length() - 1) {
                    sb.append(' ');
                }
                start = i + 1;
            }
        }
        return sb.toString();*/
    }
}
