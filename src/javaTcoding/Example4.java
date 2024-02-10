package javaTcoding;


class hack_thread extends Thread{
    public  void run () {
        for (int h = 1; h <=3; h++){
            try {
                Thread.sleep(10);
            }catch (Exception hackerearth){
                System.out.println("hello");
            }
            System.out.println(h + " ");
        }
    }
}
public class Example4 {
    public static void main(String[] args) {
        hack_thread h1 = new hack_thread();
        hack_thread h2 = new hack_thread();
        hack_thread h3 = new hack_thread();

        h1.setPriority(Thread.MAX_PRIORITY);
        h2.setPriority(Thread.MIN_PRIORITY);
        h3.setPriority(Thread.NORM_PRIORITY);

        try {
            h1.join();
            h2.join();
        }catch (Exception hackerearth) {
            System.out.println("h1");
        }
        h2.start();
        h3.start();

    }
}
