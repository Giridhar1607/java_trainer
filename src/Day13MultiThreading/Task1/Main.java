package Day13MultiThreading.Task1;


public class Main {
    public static void main(String[] args) {

        MorningThread t1 = new MorningThread();
        WelcomeThread t2 = new WelcomeThread();
        t1.start();
        t2.start();


    }
}
