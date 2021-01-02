package Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] list = {5, 4, 2, 7, 10, 9, 1, 6, 3, 8};

        Arrays.parallelSort(list);
        System.out.println(Arrays.toString(list));  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}

