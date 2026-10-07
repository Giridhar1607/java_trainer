package Day13MultiThreading;

class Counter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " counted by " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // pause 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}

public class StartVsRun {
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
