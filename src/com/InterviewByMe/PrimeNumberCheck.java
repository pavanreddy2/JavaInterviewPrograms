package com.InterviewByMe;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 11;

        boolean prime = isPrime(number);
            if (prime){
                System.out.println("Is prime");
            } else {
                System.out.println("is not prime");
            }
    }

    public static boolean isPrime (int number){
        if (number <= 2){
            return false;
        }
         for (int i = 2; i * i <=   number; i++){
             if (number % i == 0){
                 return false;
             }
         }
         return true;
    }
}
