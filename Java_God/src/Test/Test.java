package Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError();
    }

    public static void main(String[] args) {
        String[] strings = pickTwo("규니", "정규니", "규니규니");
    }

}

