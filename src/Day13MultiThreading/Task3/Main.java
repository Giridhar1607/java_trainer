package Day13MultiThreading.Task3;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current thread is: " + Thread.currentThread().getName());

        Countdown cd = new Countdown();
        cd.setName("Countdown-Thread");
        cd.start();

        System.out.println("Waiting for countdown to finish...");

        cd.join();

        System.out.println("Countdown finished! Blast off! 🚀");
    }
}
