package com.java8FullCourse;

import java.util.stream.IntStream;

public class PolidramCheck {

    public static void main(String[] args) {
        String str = "radar";
    String replace =  str.replaceAll("[^a-zA-Z]","").toLowerCase();
        boolean checkPolidram =    isPolidram(replace);


        if (checkPolidram){
            System.out.println(checkPolidram + " is polidrame");
        } else {
            System.out.println(checkPolidram + " is not Polidram");
        }

        isPolidrame1(str);
    }

    private static boolean isPolidram(String input){
       int length = input.length();
       for (int i = 0; i < length / 2; i++){
           if (input.charAt(i) != input.charAt(length - i - 1)) {
               return false;
           }
       }
       return true;
    }

    private static void isPolidrame1 (String str){
        String replace =  str.replaceAll("[^a-zA-Z]","").toLowerCase();
      boolean isPalidrame =  IntStream.range(0,replace.length() / 2)
                .noneMatch(i -> replace.charAt(i) != replace.charAt(replace.length() - i - 1));
      if (isPalidrame){
          System.out.println(str+" is a Palidrame");
      } else {
          System.out.println(str+ " is not a Palidrame");
      }
    }
}
