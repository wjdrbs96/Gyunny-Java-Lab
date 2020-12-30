package Thread;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCommonCalculate();
    }

    public void runCommonCalculate() {
        CommonCalculate cal = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(cal, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(cal, true);

        CommonCalculate cal1 = new CommonCalculate();

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + cal.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
