package Day13MultiThreading.Task1;

class MorningThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Good Morning - " + i + " by " + Thread.currentThread().getName());
        }
    }
}
