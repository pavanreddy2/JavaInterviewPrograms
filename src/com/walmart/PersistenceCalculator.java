package com.walmart;

public class PersistenceCalculator {
    public static void main(String[] args) {
        // Example usage
        int result = persistence(39);
        System.out.println("Multiplicative Persistence: " + result);
    }

    public static int persistence(int num) {
        // Base case: return 0 if num is already a single digit
        if (num < 10) {
            return 0;
        }

        int count = 0;
        while (num >= 10) {
            // Multiply the digits of num
            int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }

            // Update num with the product
            num = product;
            count++;
        }

        return count;
    }
}

