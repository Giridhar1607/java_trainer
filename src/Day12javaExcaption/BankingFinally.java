package Day12javaExcaption;

import java.util.Scanner;

class Account{
    private double balance;
    public Account(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }if(amount>balance){
            throw new ArithmeticException("Insufficient balance. Balance : "+balance);
        }
    }
}
public class BankingFinally {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account acc=new Account(5000);

        try{
            System.out.println("Enter amount to withdraw");
            double amount=sc.nextDouble();
            acc.withdraw(amount);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid Amount Error "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Transaction Failed "+e.getMessage());
        }catch (Exception e){
            System.out.println("Something went Wrong "+e.getMessage());
        }finally{
            System.out.println("Transaction Attenmpt Completed");
        }
    }
}
