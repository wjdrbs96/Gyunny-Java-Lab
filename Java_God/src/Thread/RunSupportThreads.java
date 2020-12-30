package Thread;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
    }

    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state= " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(1000);
            System.out.println("thread state(after 1sec) = " + thread.getState());

            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
