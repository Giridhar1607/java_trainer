package Day13MultiThreading.Task2;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();

        System.out.println("--- Calling run() directly ---");
        c.run();
        System.out.println("Current thread: " + Thread.currentThread().getName());

        System.out.println("--- Calling start() ---");
        Counter c2 = new Counter();
        c2.start();
        System.out.println("Main thread continues without waiting...");


    }
}
