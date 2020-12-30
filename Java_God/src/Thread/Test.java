package Thread;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.runCommonThread();
    }

    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
