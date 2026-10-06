package Ecommerce;

public class WalletPayment implements PaymentMethod{
    private double balance;
    public WalletPayment(double balance){
        this.balance=balance;
    }
    @Override
    public boolean pay(double amount){
        if(balance<amount){
            System.out.println("wallet in sufficient"+balance);
            return false;
        }
        balance-=amount;
        System.out.println("Paid rs"+amount+"in wallet"+balance);
        return true;
    }
}
