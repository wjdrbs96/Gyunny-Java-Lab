package JDK;

public class JDK7Switch {
    public static void main(String[] args) {
        JDK7Switch jdk7Switch = new JDK7Switch();
        System.out.println(jdk7Switch.salaryIncreaseAmount("Manager"));
    }

    public double salaryIncreaseAmount(String employeeLevel) {
        switch (employeeLevel) {
            case "CEO":
                return 10.0;
            case "Manager":
                return 15.0;
            case "Engineer":
                return 100.0;
        }
        return 0.0;
    }
}
