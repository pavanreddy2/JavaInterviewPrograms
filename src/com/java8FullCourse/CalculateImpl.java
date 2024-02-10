package com.java8FullCourse;

interface Calculator {
    //void switchOn ();
   // void sum (int input);
    int substract (int i1, int i2);
}
public class CalculateImpl {
    public static void main(String[] args) {

        // ()    ->   {body}
      // Calculator calculator = () -> System.out.println("Switch On");
       //calculator.switchOn();
   /*   Calculator calculator =  (input) -> System.out.println("Sum :"+ input);
        calculator.sum(100);*/
      Calculator calculator = (i1,i2) -> {
         if (i1 > i2){
             throw new RuntimeException("message");
         } else {
             return i2 - i1;
         }
      };
      System.out.println(calculator.substract(10,40));
    }
}
