package com.intellict;

public class Example1 {
    public static void main(String[] args) {

        String input1 = "SA6-3000012-4"; // Example with a different prefix and hyphen
        String input2 = "-3000012-4";    // Example with a hyphen but no prefix
        String input3 = "3000012-4";     // Example without a prefix and with a hyphen
        String input4 = "30000124";      // Example without a prefix and without a hyphen

        String input5 = "3000012";

        System.out.println(transformEntryNumberForSearch(input1));
        System.out.println(transformEntryNumberForSearch(input2));
        System.out.println(transformEntryNumberForSearch(input3));
        System.out.println(transformEntryNumberForSearch(input4));
    }

    public static String transformEntryNumberForSearch(String entryNumber) {
        // Check if the hyphen is already correctly placed
        if (entryNumber.matches(".*\\d+-\\d$")) {
            return entryNumber;
        }

        // Check for a prefix followed by a hyphen
        int hyphenIndex = entryNumber.lastIndexOf('-');
        String numericPart;
        boolean hasPrefix = hyphenIndex != -1 && !entryNumber.substring(0, hyphenIndex).matches("\\d+");

        if (hasPrefix) {
            // Keep the hyphen if there's a prefix
            numericPart = entryNumber.substring(hyphenIndex).replaceAll("[^0-9]", "");
        } else {
            // Extract only the numeric part if there's no prefix
            numericPart = entryNumber.replaceAll("[^0-9]", "");
        }

        // Check the length of the numeric part to decide how to format it
        if (numericPart.length() > 2) { // Adjusted for an extra character (hyphen)
            // Insert a hyphen before the last digit, considering the existing hyphen
            String mainPart = numericPart.substring(0, numericPart.length() - 1);
            String lastPart = numericPart.substring(numericPart.length() - 1);
            return mainPart + "-" + lastPart; // Correctly format with hyphen
        } else {
            // If there's only one digit (or hyphen and one digit), return it as is
            return numericPart;
        }

    }
}
