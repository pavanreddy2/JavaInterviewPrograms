package myInterviewExampleInWord;

public class DeadLockExample {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding lock on resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock on resource2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding lock on resource1 and resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: Holding lock on resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock on resource1");
                synchronized (resource2) {
                    System.out.println("Thread 2: Holding lock on resource2 and resource1");

                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
