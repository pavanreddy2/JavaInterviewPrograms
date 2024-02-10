package CoreJava;

class A{
    public  void displayMethod(){
        System.out.println("I am animal");
    }
}
class B extends A{
    @Override
    public  void displayMethod(){
        System.out.println("I am dog");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.displayMethod();
        b.displayMethod();

        A a1 = new B();
        a1.displayMethod();

    }
}
