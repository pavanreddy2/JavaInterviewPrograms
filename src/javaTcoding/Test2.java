package javaTcoding;

import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
        String str = "madam A A";
        System.out.println(isPalidrome(str));

    }

    public static boolean isPalidrome (String str){
        String temp = str.replaceAll("\\s+","").toLowerCase();
        return IntStream.range(0,temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
