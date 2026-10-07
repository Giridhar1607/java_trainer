package Day13MultiThreading;

class MorningThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Good Morning - " + i + " by " + Thread.currentThread().getName());
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome - " + i + " by " + Thread.currentThread().getName());
        }
    }
}

class MorningRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Good Morning Runnable - " + i);
    }
}

public class TwoThreads {
    public static void main(String[] args) {

        MorningThread t1 = new MorningThread();
        WelcomeThread t2 = new WelcomeThread();
        t1.start();
        t2.start();


    }
}