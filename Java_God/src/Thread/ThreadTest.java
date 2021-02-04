package Thread;

public class ThreadTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        new Thread(threadTest).start();
    }
}
