package com.sureshInterviewQuestions;

public class CountNumberOfDigits {
    public static void main(String[] args) {

        int number = 19233;
        int count = 0;
        while (number != 0){
            number = number / 10;
            count ++;
        }
        System.out.println(count);
    }
}
