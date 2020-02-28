package gxg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main5 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future future1 = executor.submit(() -> System.out.println("Hello World"));
        System.out.println(future1.get());

        Future<Integer> future2 = executor.submit(() -> 1);
        System.out.println(future2.get());
    }
}
