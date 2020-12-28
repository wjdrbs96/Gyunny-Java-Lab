package Thread;

public class RunSupportThreads {
    public static void main(String[] args) {
        System.out.println("시작");
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
        System.out.println("종료");
    }

    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(2016);
            thread.interrupt();
            System.out.println("thread state(after join)=" + thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
