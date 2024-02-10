package com.lambda.realExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

       Supplier<String> supplier = () -> "Hi, Good Evening";
       System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        String s = list.stream().findAny().orElseGet(supplier);
        System.out.println(s);
    }

}
