package javaTcoding;

public class FibonacciSeriesExample {
    public static void main(String[] args) {

        int num = 8;
        int f1, f2 =0, f3 = 1;

        if (num > 0){
            for (int i =1;i<=num;i++){
                System.out.println(f3+ " ");
                f1 = f2;
                f2= f3;
                f3 = f1+f2;

            }
        }
    }
}
