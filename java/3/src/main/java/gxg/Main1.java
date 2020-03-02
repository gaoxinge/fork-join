package gxg;

import java.util.concurrent.ForkJoinPool;

public class Main1 {
    private static long sum(long[] array, int low, int high) {
        long sum = 0;
        for (int i = low; i < high; i++)
            sum += array[i];
        return sum;
    }

    private static long parallelSum(long[] array, int low, int high) {
        int nThreads = Runtime.getRuntime().availableProcessors();
        ForkJoinPool pool = new ForkJoinPool(nThreads);
        Sum sum = new Sum(array, low, high);
        return pool.invoke(sum);
    }

    public static void main(String[] args) {
        long[] numbers = new long[100000000];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i;

        long d1, d2, r1, r2;
        for (int i = 100; i <= 100000000; i *= 10) {
            d1 = System.currentTimeMillis();
            r1 = sum(numbers, 0, i);
            d1 = System.currentTimeMillis() - d1;

            d2 = System.currentTimeMillis();
            r2 = parallelSum(numbers, 0, i);
            d2 = System.currentTimeMillis() - d2;

            System.out.println("length: " + i);
            System.out.println("r1: " + r1 + " d1: " + d1);
            System.out.println("r2: " + r2 + " d2: " + d2);
            System.out.println();
        }
    }
}
