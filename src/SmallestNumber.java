import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SmallestNumber {
    public static void main(String[] args) {

     String[] words =   {"cat", "dog", "Dog", "CAT", "Elephant"};

       Map<String,Long>  wordCounts = Arrays.stream(words)
                .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        wordCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter to find repeated words
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
       /*  int[] array = {10,12,8,20,30,5};
        int smallest = Arrays.stream(array).min().getAsInt();
        System.out.println(smallest);*/
    }
}
