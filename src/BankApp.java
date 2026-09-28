import java.util.Scanner;

public class BankApp {
    abstract static class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited ₹" + amount + ". Updated Balance: ₹" + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        abstract void withdraw(double amount);
        abstract double calculateInterest();

        public void displayBalance() {
            System.out.println("Account Number: " + accountNumber + " | Balance: ₹" + balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        private static final double MIN_BALANCE = 500.0;

        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        void withdraw(double amount) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Successfully withdrew ₹" + amount + ". New Balance: ₹" + balance);
            } else {
                System.out.println("Withdrawal failed! Savings accounts must maintain a minimum balance of ₹" + MIN_BALANCE);
            }
        }

        @Override
        double calculateInterest() {
            return balance * 0.04;
        }
    }

    static class CurrentAccount extends BankAccount {
        private static final double OVERDRAFT_LIMIT = -10000.0;

        public CurrentAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        void withdraw(double amount) {
            if (balance - amount >= OVERDRAFT_LIMIT) {
                balance -= amount;
                System.out.println("Successfully withdrew ₹" + amount + ". New Balance: " + balance);
            } else {
                System.out.println("Withdrawal failed! Exceeds maximum allowed overdraft limit of 10,000.");
            }
        }

        @Override
        double calculateInterest() {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SAVINGS ACCOUNT SETUP ===");
        System.out.print("Enter Account Number: ");
        String sAccNum = sc.next();
        System.out.print("Enter Initial Deposit (Min ₹500): ");
        double sBalance = sc.nextDouble();

        BankAccount savings = new SavingsAccount(sAccNum, sBalance);

        System.out.print("\nEnter amount to Deposit in Savings: ");
        savings.deposit(sc.nextDouble());

        System.out.print("Enter amount to Withdraw from Savings: ");
        savings.withdraw(sc.nextDouble());

        System.out.println("Annual Interest Earned: ₹" + savings.calculateInterest());
        savings.displayBalance();


        System.out.println("=== CURRENT ACCOUNT SETUP ===");
        System.out.print("Enter Account Number: ");
        String cAccNum = sc.next();
        System.out.print("Enter Initial Balance: ");
        double cBalance = sc.nextDouble();

        BankAccount current = new CurrentAccount(cAccNum, cBalance);

        System.out.print("\nEnter amount to Deposit in Current: ");
        current.deposit(sc.nextDouble());

        System.out.print("Enter amount to Withdraw from Current (Overdraft allowed): ");
        current.withdraw(sc.nextDouble());

        System.out.println("Annual Interest Earned: ₹" + current.calculateInterest());
        current.displayBalance();

        sc.close();
    }
}