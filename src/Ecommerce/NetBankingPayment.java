package Ecommerce;

public class NetBankingPayment implements PaymentMethod{
    private String bankId;
    public NetBankingPayment(String bankId){
        this.bankId=bankId;
    }
    public boolean pay(double amount){
        System.out.println("Paid rs"+amount+"via net banking"+bankId);
        return true;
    }
}
