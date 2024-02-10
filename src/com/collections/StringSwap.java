package com.collections;

public class StringSwap {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbda";

        // Swap the first two characters of each string and check if they are equal
        String swappedS1 = swapFirstTwoCharacters(s1);
        String swappedS2 = swapFirstTwoCharacters(s2);
        boolean areEqual = false;
        for (int i = 0; i < s1.length(); i++) {
            if (swappedS1.charAt(i) != s2.charAt(i) || swappedS2.charAt(i) != s1.charAt(i)) {
                areEqual = true;
                break;
            }
        }

        // Print the swapped strings and the result
        System.out.println("Swapped s1: " + swappedS1);
        System.out.println("Swapped s2: " + swappedS2);
        System.out.println("Are the swapped strings equal? " + areEqual);
    }

    private static String swapFirstTwoCharacters(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        char temp = chars[0];
        chars[0] = chars[1];
        chars[1] = temp;
        return new String(chars);
    }
    }

