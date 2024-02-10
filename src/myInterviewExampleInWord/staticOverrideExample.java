package myInterviewExampleInWord;

class Parent{
    static void staticMethod (){
        System.out.println("static method in Parent");
    }
}

class Child extends Parent{
    // This is not an override; it's a method hiding
    static void staticMethod (){
        System.out.println("static Method in child");
    }
}
public class staticOverrideExample {
    public static void main(String[] args) {
        Parent.staticMethod();
        Child.staticMethod();
    }
}
