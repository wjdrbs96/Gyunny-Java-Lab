package Test;

public class Test {
    private int x;
    private int y;

    public static void main(String[] args) {
        Object obj = null;
        System.out.println(obj);
        System.out.println(obj + " Love you");
        Test test = new Test();
        System.out.println(test);
    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

