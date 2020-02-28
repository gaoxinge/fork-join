package gxg;

import java.util.concurrent.*;

public class Main5 {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable runnable = () -> System.out.println("Hello World");
        executor.scheduleWithFixedDelay(runnable, 3, 2, TimeUnit.SECONDS);
    }
}
