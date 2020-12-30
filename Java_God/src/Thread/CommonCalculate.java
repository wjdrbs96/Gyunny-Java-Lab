package Thread;

public class CommonCalculate {
    private int amount;
    private int interest;

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int value) {
        synchronized (this) {
            amount += value;
        }
    }

    public void addInterest(int value) {
        interest += value;
    }

    public synchronized void minus(int value) {
        synchronized (this) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
