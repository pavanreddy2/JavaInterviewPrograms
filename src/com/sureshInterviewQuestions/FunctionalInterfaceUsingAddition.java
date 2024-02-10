package com.sureshInterviewQuestions;



interface  Adder {
    int addition (int a, int b);
}

public class FunctionalInterfaceUsingAddition {
    public static void main(String[] args) {

     Adder add =   (a,b) -> a + b;
     int result = add.addition(100,20);
     System.out.println(result);
    }
}
