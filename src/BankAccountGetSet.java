public class BankAccountGetSet {
    private String accountNumber;
    private double balance;

    public BankAccountGetSet() { }

    public BankAccountGetSet(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        setBalance(balance);
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0){
            System.out.println("Error: Balance cannot be negative.");
        }else{
            this.balance=balance;
        }
    }


    public static void main(String[] args){
        BankAccountGetSet account= new BankAccountGetSet();

        System.out.println("Setting valid value");
        account.setAccountNumber("Acc-12345");
        account.setBalance(500.00);

        System.out.println("Account Number:"+account.getaccountNumber());
        System.out.println("Balance is :"+account.getBalance());

        System.out.println("Attempting Invalid Balance Update");
        account.setBalance(-150.75);

        System.out.println("Balance After invalid update:"+account.getBalance());
        account.setBalance(750.50);
        System.out.println("new Balance:" +account.getBalance());
    }
}

