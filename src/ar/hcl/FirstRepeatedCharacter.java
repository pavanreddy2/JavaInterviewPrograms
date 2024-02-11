package ar.hcl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "pavan";

        Set<Character> set = new HashSet<>();

        //str.chars(): - it returns an IntStream of interValues representing the Unique Code of
        //Character in the String
        Character firstRepeatedChar = str.chars()
                //convert the eachElement of IntStream into the object Stream<Character>.
                //where each Integer value represents a unique code
                .mapToObj(c -> (char) c)
                //It takes each Integer 'c' from stream and casts it to 'char'
                .filter(c -> !set.add(c))
                .findFirst()
                .orElse(null);

        if (firstRepeatedChar != null){
            System.out.println("Repeated Character :"+ firstRepeatedChar);
        } else {
            System.out.println("No repeated Character");
        }
    }
}
