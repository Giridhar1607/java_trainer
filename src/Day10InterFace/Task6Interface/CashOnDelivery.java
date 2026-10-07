package Day10InterFace.Task6Interface;

public class CashOnDelivery implements Payment {

    @Override
    public boolean processPayment(double amount) {

        System.out.println(
                "Cash on Delivery selected."
        );

        System.out.println(
                "Please pay ₹" + amount + " on delivery."
        );

        return true;
    }
}
