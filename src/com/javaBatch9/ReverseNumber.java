package com.javaBatch9;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;
        while (num != 0){
          int digit =  num % 10; // 5
          reverse = reverse * 10 + digit; // reverse = 0 * 10 + 5// 5
            num = num / 10; //12345 / 10 ==> 1234
        }
        System.out.println(reverse);
    }
}
