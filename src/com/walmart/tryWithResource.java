package com.walmart;

import java.io.*;

public class tryWithResource {
    public static void main(String[] args) {

        String path = "F:\\All My Practice\\";


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
