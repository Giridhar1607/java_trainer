
static public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }


public void unsafeWithdraw(int amount) {
    if (balance >= amount) {
        System.out.println(Thread.currentThread().getName() + " passed balance check. Balance: " + balance);

        // Artificial delay to reliably expose the race condition
        try { Thread.sleep(50); } catch (InterruptedException e) {}

        // 2. ACT: Thread modifies the balance
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal. New Balance: " + balance);
    } else {
        System.out.println(Thread.currentThread().getName() + " failed check. Insufficient funds. Balance: " + balance);
    }

}


public synchronized void safeWithdraw(int amount) {
    if (balance >= amount) {
        System.out.println(Thread.currentThread().getName() + " passed balance check. Balance: " + balance);

        try { Thread.sleep(50); } catch (InterruptedException e) {}

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal. New Balance: " + balance);
    } else {
        System.out.println(Thread.currentThread().getName() + " failed check. Insufficient funds. Balance: " + balance);
    }

}
}
public static void main(String[] args) throws InterruptedException {
    BankAccount account = new BankAccount();
    int withdrawalAmount = 70;

    Runnable task = () -> {
        account.unsafeWithdraw(withdrawalAmount);
    };

    Thread thread1 = new Thread(task, "Thread-1");
    Thread thread2 = new Thread(task, "Thread-2");

    System.out.println("Initial Account Balance: " + account.getBalance());
    System.out.println("--- Starting Withdrawals ---");

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
}

