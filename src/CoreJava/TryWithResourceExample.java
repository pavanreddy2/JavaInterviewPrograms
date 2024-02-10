package CoreJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        String line;
        try {
            FileReader file = new FileReader("E:\\Java Coding Files");
            BufferedReader br = new BufferedReader(file);
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
