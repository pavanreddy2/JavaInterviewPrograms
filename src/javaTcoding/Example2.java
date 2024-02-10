package javaTcoding;

import java.util.HashSet;

interface IntNumber {
    void ins(int item);
    int delt();
}
class HackerEarch implements IntNumber {


    private int stck[];

    private int pos;

    HackerEarch (int size) {
        stck = new int[size];
        pos = -1;
    }
    public void  ins (int item){
        if (pos == stck.length-1)
            System.out.println("Overflow");
        else
            stck[++pos] = item;
    }
public int delt () {
        if (pos < 0){
            System.out.println("Underflow");
            return 0;
        }
        else
            return stck[pos --];
}
}
public class Example2 {
    public static void main(String[] args) {

        HackerEarch obj = new HackerEarch(3);
        for (int i = 0; i <4; i++) obj.ins(i);
        for (int i = 0; i <=3; i++)
            System.out.println(obj.delt());
    }
}
