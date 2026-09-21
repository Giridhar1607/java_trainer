public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    protected void setBalance(double balance){
        this.balance=balance;
    }
    public boolean withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Withdraw Amount");
            return false;
        }
        if(balance>=amount){
            balance -=amount;
            System.out.println("Sucessful withdraw $"+ amount +", Remaining Balance: "+balance);
            return true;
        }else{
            return false;
        }
    }
    static class SavingAccount extends Account{
        private double interestRate;

        public SavingAccount(String accountNumber,double balance,double interestRate){
            super(accountNumber,balance);
            this.interestRate=interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }
        @Override
        public boolean withdraw(double amount){
            if((getBalance() - amount) < 500){
                System.out.println("Transaction Reject: min Balance is reqied $500 after withdraw!");
                return false;
            }
            return super.withdraw(amount);
        }
    }
    public static void main(String[] args){
        System.out.println("--Standard Account--");
        Account acc= new Account("ACC-101",1000.0);
        acc.withdraw(600.0);

        System.out.println("--Saving Account--");
        SavingAccount savAcc = new SavingAccount("SAV_202",1000.0,3.5);

        savAcc.withdraw(600.0);
        savAcc.withdraw(400.0);
    }
}
