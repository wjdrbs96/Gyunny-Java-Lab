package Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);
        set.add(2);

        set.forEach(System.out::println);

    }
}

