package Thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    long from, to;

    public SumTask(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long compute() {
        long size = to - from + 1;

        if (size <= 5) {
            return sum();
        }

        long half = (from + to) / 2;

        SumTask leftSum = new SumTask(from, half);
        SumTask rightSum = new SumTask(half + 1, to);

        leftSum.fork();
        return rightSum.compute() + leftSum.join();
    }

    public Long sum() {
        long sum = 0;
        for (long i = from; i < to + 1; ++i) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

    }
}
