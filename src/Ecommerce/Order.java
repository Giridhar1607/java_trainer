package Ecommerce;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    private PaymentMethod paymentMethod;
    private double totalAmount;

    public Order(Customer customer, List<Product> products, PaymentMethod pm) {
        this.customer = customer;
        this.products = new ArrayList<>(products);
        this.paymentMethod = pm;
        calculateTotal();
    }

    private void calculateTotal() {
        double sum = 0;
        for (Product p : products) sum += p.getFinalPrice();
        this.totalAmount = customer.applyDiscount(sum);
    }

    public boolean checkout() {
        System.out.println("\n--- Order Summary ---");
        products.forEach(p -> System.out.println(p));
        System.out.println("Total after loyalty discount: " + totalAmount);
        return paymentMethod.pay(totalAmount);
    }
}
