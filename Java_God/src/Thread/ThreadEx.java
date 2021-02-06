package Thread;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadEx {
    private int balance = 1000;
    Object object = new Object();

    public int getBalance() {
        return balance;
    }

    public void widthdraw(int money) {
        synchronized (object) {
            if (balance >= money) {

            }
        }
    }
}