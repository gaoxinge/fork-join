package gxg;

public class Main3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Hello"));
        Thread thread2 = new Thread(() -> System.out.println("World"));

        thread1.start();
        thread2.start();
    }
}
