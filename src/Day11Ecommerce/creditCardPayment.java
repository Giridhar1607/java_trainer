package Day11Ecommerce;

public class creditCardPayment implements PaymentMethod {
    private String cardNumber;

    public creditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean pay(double amount) {

        if (!cardNumber.matches("\\d{16}")) {
        System.out.println("Invalid Card : Card number must be 16 digits");
        return false;
    }
    System.out.println("Paid Rs"+amount+"via credit card");
    return true;
    }
}
