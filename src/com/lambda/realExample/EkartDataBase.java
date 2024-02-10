package com.lambda.realExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getll () {
        return Stream.of(
                new Customer(101, "john","john@gmail.com", Arrays.asList("928388192","388239299")),
                new Customer(102, "smith","smith@gmail.com", Arrays.asList("816368686","3868681868")),
                new Customer(103, "peter","peter@gmail.com", Arrays.asList("2566815997","8445784649")),
                new Customer(104, "kely","kely@gmail.com", Arrays.asList("9574119791","75457946454"))
                ).collect(Collectors.toList());
    }
}
