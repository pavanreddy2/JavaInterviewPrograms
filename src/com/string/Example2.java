package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        String str = "java programming";

        int index = findFirstNonRepeatedCharIndex(str);
        System.out.println(index);

    }

    public static int findFirstNonRepeatedCharIndex(String str) {
        // create a map of character frequencies using Java 8 streams
        Map<Character, Long> charFreq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // find the first non-repeated character using Java 8 streams
        OptionalInt index = IntStream.range(0, str.length())
                .filter(i -> charFreq.get(str.charAt(i)) == 1)
                .findFirst();

        // return the index of the first non-repeated character, or -1 if not found
        return index.isPresent() ? index.getAsInt() : -1;
    }
}
