package com.InterviewByMe;

import java.util.stream.IntStream;


public class PolydrameCheck {
    public static void main(String[] args) {
        String str = "madam ii madam A";
        System.out.println(
                IntStream.range(0, str.length() / 2)
                        .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1))
        );

    }
}
