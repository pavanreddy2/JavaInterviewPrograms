package myInterviewExampleInWord;

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacter {
    public static void main(String[] args) {

        String str = "pavanKumark";

        Map<Character, Long> repeatedCharacter = str.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter( entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(repeatedCharacter);
    }


}
