package com.Arrayprogramms;
class A {
    private int m = 48;
}
class Y extends A {
    void m1 (){
        System.out.println("m1-A");
    }
}

public class Exmaple {
    public static void main(String[] args) {
        Y y = new Y();
        y.m1();

    }
}
