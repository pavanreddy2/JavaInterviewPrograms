package com.java8FullCourse;

public class SumOfIntegers {
    public static void main(String[] args) {
        int number = 12342;
       int n = addSum(number);
       System.out.println(n);
    }
    public static int addSum(int digits){
        int num = 0;
        while (digits > 0){
            // Extract the last digit
            int remainder = digits % 10;
            // // Add the digit to the sum
            num = num + remainder;
            // Remove the last digit from the number
            digits = digits / 10;
        }
        return num;
    }
}
