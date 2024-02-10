package com.allProgrammes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exampl1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pavan", "Abc", "Raju", "Mahesh");

      String[] array =   list.toArray(new String[0]);
       boolean sorted;
       do {
           sorted = true;
           for (int i = 0; i<array.length - 1;i++){
               if (array[i].compareToIgnoreCase(array[i + 1]) > 0){
                   String temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
                   sorted = false;
               }
           }
       }while (!sorted);
        List<String> list1 = Arrays.asList(array);
        list1.forEach(System.out::println);
    }
}
