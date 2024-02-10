package com.InterviewByMe;

public class MainEx {
    public static void main(String[] args) {
        A a = new A();
        a.getSting();//Hello A
        //B b = new A();
        // This line of code will result in a compile-time error
        // because you cannot assign an instance of a superclass (A) to a reference variable of a subclass (B).
        // In Java, a subclass reference can point to an instance of the subclass itself or an instance of any subclass derived from it,
        // but not to an instance of its superclass.
       A a1 = new B();
       a1.getSting();//Hello B
    }
}
