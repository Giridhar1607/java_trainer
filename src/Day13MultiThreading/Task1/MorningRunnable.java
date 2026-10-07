package Day13MultiThreading.Task1;

class MorningRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Good Morning Runnable - " + i);
    }
}
