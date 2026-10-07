package Day10InterFace.Task6Interface;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void checkout(Payment payment) {

        System.out.println("\nProcessing checkout...");

        boolean success = payment.processPayment(totalAmount);

        if (success) {
            System.out.println(
                    "Checkout completed successfully."
            );
        } else {
            System.out.println(
                    "Checkout failed."
            );
        }
    }
}
