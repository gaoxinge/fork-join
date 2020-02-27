package gxg;

import java.util.concurrent.*;

public class Main3 {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable runnable = () -> System.out.println("Hello World");
        Future future1 = executor.schedule(runnable, 3, TimeUnit.SECONDS);
        System.out.println(future1.get());

        Callable<Integer> callable = () -> 1;
        Future<Integer> future2 = executor.schedule(callable, 3, TimeUnit.SECONDS);
        System.out.println(future2.get());
    }
}