package Test;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(Objects.hashCode(o));
    }
}
