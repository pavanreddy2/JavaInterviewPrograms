package myInterviewExampleInWord;

public class ReturnStatementInTry {
    public static void main(String[] args) {

        //m1();
        System.out.println(m1());
    }
    public static int m1 () {

        //int resultValue = 0;
        try {
            System.out.println("Try Block Execution");
            //int result = 10;
            return 10; // This value will be overridden by the return to the final block
            // resultValue = result;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception:"+ e);
        } finally {
            System.out.println("Finally Block Execution");
            return 100; // This value will be returned
        }
        //return 100;
        //return resultValue;
    }
}
