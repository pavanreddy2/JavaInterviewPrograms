package javaTcoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "cat", "hello");
        String input = "HELlo howCATTare you xyzapple123";

        // Convert the input string to lowercase
        String lowercaseInput = input.toLowerCase();

        // Split the lowercase input string into individual words
        String[] inputWords = lowercaseInput.split("\\W+");

        // Count the number of matching words, ignoring case and considering both lowercase and uppercase variations
        int count = 0;
        for (String inputWord : inputWords) {
            for (String word : words) {
                if (word.equalsIgnoreCase(inputWord)) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Word count: " + count);


    }
}


