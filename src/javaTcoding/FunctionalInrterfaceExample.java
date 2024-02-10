package javaTcoding;

@FunctionalInterface
interface MyInterface{
    int getValues ();
}

public class FunctionalInrterfaceExample {
    public static void main(String[] args) {

        MyInterface ref;
        ref = () -> 10;
        System.out.println(ref.getValues());
    }
}
