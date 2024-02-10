package myInterviewExampleInWord;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedWords {
    public static void main(String[] args) {

        String inputString = "java is a programming language java is widely used for development";

        Map<String, Long> repeatedWord = Arrays.stream(inputString.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(word -> word.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(repeatedWord);
    }
}
