package com.java8FullCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnonymousFunEx {

    public void m1 () {
        System.out.println("Normal Method");
    }

  /*  () {
        System.out.println("Anonymous Function");
    }*/

    public static void main(String[] args) {
        new AnonymousFunEx().m1();
    }

    public static class SortListDemo {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(300);
                list.add(399);
            list.add(39);
            list.add(400);

            List<Integer> li = list.stream().sorted().collect(Collectors.toList());
            List<Integer> li2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(li);
            System.out.println(li2);
        }
    }
}
