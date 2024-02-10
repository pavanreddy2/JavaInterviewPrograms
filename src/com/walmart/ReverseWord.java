package com.walmart;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Santander";

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

       String reverseString =  new StringBuilder(str)
                .chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c + s, (s1,s2) -> s2 + s1);

       System.out.println(reverseString);
    }

}
