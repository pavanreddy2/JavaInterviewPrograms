package com.lambda.realExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
    /*   Consumer consumerDemo = (i) -> System.out.println(i);
       consumerDemo.accept(10);*/

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
         list.stream().forEach(r -> System.out.println(r));
    }

}
