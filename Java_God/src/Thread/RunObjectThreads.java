package Thread;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        sample.checkThreadState2();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread1 = new StateThread(monitor);

        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            thread1.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (monitor) {
                monitor.notifyAll();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
            thread1.join();
            System.out.println("thread state(after join) = " + thread1.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
