package com.java8Techie;

import java.util.stream.IntStream;

public class LImitAndSkipExample {
    public static void main(String[] args) {
        IntStream
                .rangeClosed(1,10)
                .skip(1)
                    .limit(9)
                        .forEach(System.out::print);
    }
}
