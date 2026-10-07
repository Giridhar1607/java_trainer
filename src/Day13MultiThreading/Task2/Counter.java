///
package Day13MultiThreading.Task2;

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
