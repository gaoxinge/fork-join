package gxg;

public class Main2 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Hello");
        Runnable runnable2 = () -> System.out.println("World");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
