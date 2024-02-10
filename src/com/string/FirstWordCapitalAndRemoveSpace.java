package com.string;



import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstWordCapitalAndRemoveSpace {

    public static void main(String[] args) {
        String s = " i am going to america with my family"; //o/p: IAmGoingToAmericaWithMyFamily
        String[] words = s.split(" ");


        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() >= 1) {
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
                sb.append(capitalized);
            }
        }
        System.out.println(sb);

        System.out.println("***************");
        String result1 = Arrays.stream(s.split(" ")).filter(w -> !w.isEmpty()).map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining());
        System.out.println(result1);

    }
}
