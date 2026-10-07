package Day13MultiThreading.Task1;

class WelcomeThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome - " + i + " by " + Thread.currentThread().getName());
        }
    }
}
