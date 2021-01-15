package Test;

public class VolatileSample extends Thread {
    private double instanceVariable = 0;

    public void setDouble(double value) {
        this.instanceVariable = value;
    }

    @Override
    public void run() {
        try {
            while (instanceVariable == 0) {
                Thread.sleep(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
