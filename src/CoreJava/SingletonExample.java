package CoreJava;

class Singleton {

    private static Singleton single_instance = null;

    String s;
    private Singleton(){
        s= "This is Singleton class";
    }

    public static Singleton getInstance(){
        if (single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
public class SingletonExample {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.hashCode());
    }
}
