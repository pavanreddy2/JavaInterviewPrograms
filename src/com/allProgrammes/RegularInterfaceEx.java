package com.allProgrammes;

public class RegularInterfaceEx {
    public static void main(String[] args) {

        RegularInterface regularInterface = new RegualarInterfaceImpl();

        regularInterface.methodOne();
        regularInterface.methodTwo();
        regularInterface.defaultMethod();
       RegularInterface.staticMethod();
       RegularInterface.staticMethodTwo();
       regularInterface.defaultMethodTwo();
    }
}
