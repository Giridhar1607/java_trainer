class BankAccount{
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public BankAccount(String accountNumber,String accountHolder){
        this(accountNumber,accountHolder,500.0);
    }
    public BankAccount(){
        this("SBI0000","GUEST");
    }

    public void display(){
        System.out.println("Account: "+accountNumber+", Holdet: "+accountHolder+", Balance: "+balance);
    }
}

public class construChain {
    public static void main(String[] args){
        BankAccount acc1 =new BankAccount("Acc123","sai",1500.0);
        BankAccount acc2 = new BankAccount("Acc5678","Rajesh");
        BankAccount acc3 = new BankAccount();

        acc1.display();
        acc2.display();
        acc3.display();
    }
}
