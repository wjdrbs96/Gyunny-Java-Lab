package Thread;

public class RunObjectThread {
    public static void main(String[] args) {
        RunObjectThread runObjectThread = new RunObjectThread();
        runObjectThread.checkThreadState2();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread stateThread = new StateThread(monitor);

        try {
            System.out.println("thread state = " + stateThread.getState());
            stateThread.start();
            System.out.println("thread state(after start) = " + stateThread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + stateThread.getState());

            synchronized (monitor) {
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + stateThread.getState());
            stateThread.join();
            System.out.println("thread state(after join) = " + stateThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
