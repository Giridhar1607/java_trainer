package Day13MultiThreading;

class Countdown extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); }
            catch (InterruptedException e) {}
        }
    }
}

public class JoinDemo {
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
