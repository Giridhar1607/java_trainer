package Day13MultiThreading.Task3;

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
