package myInterviewExampleInWord;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton {
    private static Singleton get_Instance = null;

    String s;

    public Singleton(){
        s = "This is singleton Class";
        //To Prevent the Singleton from the Reflection API
        //throw new RuntimeException("Singleton instance already created. Use getInstance() method.");
    }

    public static Singleton getInstance(){
        if (get_Instance == null){
            get_Instance = new Singleton();
        }
        return get_Instance;
    }
}
public class SingletonExample {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(singleton.hashCode());

        //To break the Singleton
        Singleton objTwo = null;
        try {
            Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
           objTwo = declaredConstructor.newInstance();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(singleton.hashCode());
        System.out.println(objTwo.hashCode());
    }
}
