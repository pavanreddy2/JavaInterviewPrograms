package com.InterviewByMe;

import java.util.stream.IntStream;

public class isPalindromeCheck {
    public static void main(String[] args) {

        String str = " racecar2 ";
        System.out.println(isPalindrome(str));
    }

    public static String isPolidrame1 (String input){
      String temp =  input.replaceAll("\\s","").toLowerCase();

      return temp;
    }
    public static boolean isPalindrome (String input){
       String temp =  input.replaceAll("\\s", "").toLowerCase();

       return IntStream.range(0,temp.length() / 2)
               .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
