package com.walmart;

class Singleton {

    private static Singleton get_Instance = null;

    String s;

    public Singleton(){
        s = "This is Singleton class";
    }

    public static  Singleton getInstance(){
        if (get_Instance == null) {

            synchronized (Singleton.class) {
                if (get_Instance == null)
                get_Instance = new Singleton();
            }
        }
        return get_Instance;
    }

}
public class SingletonExample {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
