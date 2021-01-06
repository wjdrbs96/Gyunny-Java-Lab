package Test;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);

        intList.stream().map(x -> x * 3).forEach(System.out::println);
    }
}

