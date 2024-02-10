package myInterviewExampleInWord;

public class SynchronizedExampleForString {
    private static String sharedString = "Hello";
    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (sharedString){
                sharedString = sharedString + " world";
                System.out.println(sharedString);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
