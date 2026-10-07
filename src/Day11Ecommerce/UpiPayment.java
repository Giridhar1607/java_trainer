package Day11Ecommerce;

public class UpiPayment implements PaymentMethod {
    private String upiId;

    public UpiPayment(String upiId) {
        // Trim and store, avoid null
        this.upiId = (upiId != null) ? upiId.trim() : null;
    }

    @Override
    public boolean pay(double amount) {
        if (upiId == null || upiId.isEmpty()) {
            System.out.println("Invalid UPI ID: ID cannot be empty");
            return false;
        }
        if (!upiId.contains("@")) {
            System.out.println("Invalid UPI ID: must contain @  e.g. 1234@ybl");
            return false;
        }
        System.out.println("Paid Rs." + amount + " via UPI " + upiId);
        return true;
    }
}