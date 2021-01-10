package Test;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("1.0");
        BigDecimal addValue = new BigDecimal(0.1);
        for (int i = 0; i < 10; ++i) {
            value = value.add(addValue);
            System.out.println(value.toString());
        }
    }
}

