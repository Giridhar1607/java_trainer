package Task6Interface;

public class UpiPayment implements Payment {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    private boolean isValidUpi() {
        return upiId != null && upiId.contains("@");
    }

    @Override
    public boolean processPayment(double amount) {

        if (!isValidUpi()) {
            System.out.println(
                    "Payment failed: Invalid UPI ID."
            );

            return false;
        }

        System.out.println(
                "UPI payment successful: ₹" + amount
        );

        return true;
    }
}
