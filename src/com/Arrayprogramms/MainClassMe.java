package com.Arrayprogramms;


import java.util.Arrays;
import java.util.List;

/*class a1 implements  a2{


    @Override
    public int m1(int i) {
        return i = +i * i;
    }
}

interface  a2 {
    int m1 (int i);
}*/

class HacherHar {
    int getValue (){
        int returnValue = 10;
        try {
            String[] language = {
                    "Java", "Ruby"
            };
            System.out.println(language[5]);
        } catch (Exception e) {
            System.out.println("Catch Block " + returnValue);
            return returnValue;
        } finally {
             returnValue += 10;
             System.out.println("Finally Block :+"+ returnValue);
        }
        return returnValue;
    }
}
public class MainClassMe {

    public static void main(String[] args) {

     /*   a2 a = new a1();
        System.out.println(a.m1(2));*/
 /*    int a = 0;
     int b = 3;
     while (++ a < 3){
         int c = --a + b++;
         switch (b) {
             default:
             case 0: a = ++a + a--;
             case 1 : a += a-- + ++b;
         }
     }
     System.out.println(a);*/
  HacherHar va = new HacherHar();
  System.out.println("Main Block: "+ va.getValue());
    }
}
