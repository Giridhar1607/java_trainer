interface Payment {
    boolean processPayment(double amount);
}
static class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        if (cardNumber != null && cardNumber.length() == 16) {
            System.out.println("Processing Credit Card payment of $" + amount + "...");
            System.out.println("Payment Successful!");
            return true;
        } else {
            System.out.println("Payment Failed: Invalid Card Number (Must be 16 digits).");
            return false;
        }
    }
}

static class UpiPayment implements Payment {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean processPayment(double amount) {
        if (upiId != null && upiId.contains("@")) {
            System.out.println("Processing UPI payment of $" + amount + " via ID [" + upiId + "]...");
            System.out.println("Payment Successful!");
            return true;
        } else {
            System.out.println("Payment Failed: Invalid UPI ID (Missing '@').");
            return false;
        }
    }
}

static class CashOnDelivery implements Payment {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Order placed with Cash on Delivery for $" + amount + ".");
        System.out.println("Please pay the amount upon delivery. Success!");
        return true;
    }
}

static class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void checkout(Payment paymentMethod) {
        System.out.println("\n--- Initiating Checkout ---");
        boolean result = paymentMethod.processPayment(totalAmount);
        if (result) {
            System.out.println("Checkout Complete: Order has been placed successfully.");
        } else {
            System.out.println("Checkout Failed: Please try another payment method.");
        }
    }
}

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(250.75);

        Payment invalidCard = new CreditCardPayment("12345");
        cart.checkout(invalidCard);

        Payment validCard = new CreditCardPayment("1234567890123456");
        cart.checkout(validCard);

        Payment upi = new UpiPayment("user@okbank");
        cart.checkout(upi);

        Payment cod = new CashOnDelivery();
        cart.checkout(cod);
    }
