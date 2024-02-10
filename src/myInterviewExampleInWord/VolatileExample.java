package myInterviewExampleInWord;

class Example {
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
        System.out.println(flag);
    }

    public boolean checkFlag() {
        return flag;
    }
}
public class VolatileExample {
    public static void main(String[] args) {
        Example example = new Example();

        new Thread(() -> {
            example.setFlag();
        }).start();

        new Thread(() -> {
            boolean result = example.checkFlag();
            System.out.println(result);
        }).start();
    }
}
