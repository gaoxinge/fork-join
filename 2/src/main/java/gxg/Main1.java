package gxg;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main1 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable runnable = () -> System.out.println("Hello World");
        Future future1 = executor.submit(runnable);
        System.out.println(future1.get());

        Callable<Integer> callable = () -> 1;
        Future<Integer> future2 = executor.submit(callable);
        System.out.println(future2.get());
    }
}
