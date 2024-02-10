package com.springboot;

class Singleton {
    private static Singleton get_instance= null;
    String s;
    private Singleton (){
        s= "hello";
    }
    public static Singleton singleInstance(){
        if (get_instance==null){
            get_instance = new Singleton();
        }
        return get_instance;
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        Singleton x = Singleton.singleInstance();
        Singleton y = Singleton.singleInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
    }
}
