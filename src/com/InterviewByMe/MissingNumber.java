package com.InterviewByMe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 7, 9);

        String missingNumbers = IntStream.range(1,Collections.max(list))
                                    .filter(i -> !list.contains(i))
                                        .mapToObj(String::valueOf)
                                            .collect(Collectors.joining(","));

      System.out.println(missingNumbers);
    }
}
