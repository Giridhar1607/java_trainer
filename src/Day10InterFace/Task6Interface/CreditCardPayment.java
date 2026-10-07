package Day10InterFace.Task6Interface;

public class CreditCardPayment implements Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private boolean isValidCard() {
        return cardNumber != null
                && cardNumber.matches("\\d{16}");
    }

    @Override
    public boolean processPayment(double amount) {

        if (!isValidCard()) {
            System.out.println(
                    "Payment failed: Card number must contain exactly 16 digits."
            );

            return false;
        }

        System.out.println(
                "Credit Card payment successful: ₹" + amount
        );

        return true;
    }
}
