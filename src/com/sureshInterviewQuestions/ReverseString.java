package com.sureshInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String s = "anurudh";
        String reverse = " ";
        for (int i = s.length() -1; i>=0; i--){
            reverse = reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
}
