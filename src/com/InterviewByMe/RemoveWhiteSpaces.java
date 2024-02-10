package com.InterviewByMe;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "pavan kumar reddy";
        String removedWhiteSpace =   Arrays.stream(str.trim().split("\\s+"))
                .collect(Collectors.joining(""));
      System.out.println(removedWhiteSpace);
      //str.trim():This method is called on the string str. trim() removes any leading and trailing whitespace from the string.
        // It does not affect the spaces inside the string.
        //split("\\s+"): This splits the trimmed string into an array of strings using the regular expression "\\s+".
        // This regex matches one or more whitespace characters (spaces, tabs, newlines, etc.).
        //Arrays.stream(str.trim().split("\\s+")): This creates a stream of the individual words obtained after splitting the string.
        //collect(Collectors.joining("")): This collects the individual words from the stream and joins them back into a single string, s
        // Separated by an empty string (hence removing any whitespace between words).
    }
}
