package com.InterviewByMe;

class Singleton {

    //This declares a static variable get_Instance of type Singleton and initializes it to null. This will hold the single instance of the class.
    private static Singleton get_Instance = null;

    //This declares a String variable s within the class. It can be used to store any data you want associated with the single instance.
    String s;

    //his defines a private constructor for the Singleton class. This prevents other classes from directly creating new instances using new Singleton()
    private Singleton () {
        s = "singleton is creating";

    }

    //This is a public static method called getInstance. It checks if the get_Instance variable is already initialized (not null). If not, it creates a new instance of Singleton and assigns it to the get_Instance variable. Finally, it returns the get_Instance variable, which always points to the same Singleton object.
    public static Singleton getInstance(){
        if (get_Instance == null){
            get_Instance = new Singleton();
        }
        return get_Instance;
    }
}
public class SingletonEx {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
