package CoreJava;

class Parent{
    public static void m1(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    public static void m1(){
        System.out.println("Child Method");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();

        Parent c = new Child();
        c.m1();

       // Child c1 = new Parent();
        Child c2 = new Child();
        c2.m1();
    }
}
