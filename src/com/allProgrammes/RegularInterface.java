package com.allProgrammes;
 interface RegularInterface {
    void methodOne();
    void methodTwo ();
    static void staticMethod(){
        System.out.println("Static Method in RegularInterface");
    }
     static void staticMethodTwo(){
         System.out.println("Static MethodTwo in RegularInterface");
     }
    default void defaultMethod() {
        System.out.println("Default Method in RegularInterface");
    }
     default void defaultMethodTwo() {
         System.out.println("Default MethodTwo in RegularInterface");
     }
}
