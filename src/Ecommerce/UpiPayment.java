package Ecommerce;

public class UpiPayment implements PaymentMethod{
    private String UpiId;
    public UpiPayment(String upiId){
        this.UpiId=UpiId;
    }
    @Override
    public boolean pay(double amount){
        if(!UpiId.contains("@")){
            System.out.println("Invalid Upi id Must contain @");
            return false;
        }
        System.out.println("Paid Rs"+amount+"via Upi id"+UpiId);
        return true;
    }

}
