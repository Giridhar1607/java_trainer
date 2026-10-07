package Day11Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> catalog = new ArrayList<>();
        catalog.add(new ElectronicsProduct("P1001", "Laptop", 50000));
        catalog.add(new ClothingProduct("P1002", "Shirt", 2000, 20));
        catalog.add(new GroceryProduct("P1003", "Milk", 100, true));

        Customer customer = new Customer("U101", "Ananya");
        Admin admin = new Admin("A001", "Admin");

        System.out.println("--- Polymorphism Demo via User[] ---");
        User[] users = {customer, admin};
        for (User  u: users) u.display_info();

        admin.addProducttoCatlog(catalog, new ClothingProduct("P1004", "Jeans", 3000, 10));

        while (true) {
            System.out.println("\n1.Browse 2.Add to Cart 3.View Cart 4.Checkout 5.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            if (ch == 1) catalog.forEach(System.out::println);
            else if (ch == 2) {
                System.out.print("Enter Product ID: ");
                String id = sc.next();
                catalog.stream().filter(p -> p.getProductId().equals(id)).findFirst().ifPresentOrElse(
                                customer::addToCart, () -> System.out.println("Not found"));
            } else if (ch == 3)
                System.out.println("Cart: " + customer.getCart());
            else if (ch == 4) {
                if (customer.getCart().isEmpty()) {
                    System.out.println("Cart empty");
                    continue; }
                System.out.println("Payment: 1.Card 2.UPI 3.Wallet 4.NetBanking(NEW)");
                int pch = sc.nextInt();
                sc.nextLine();
                PaymentMethod pm = null;
                if (pch == 1) {
                    System.out.print("16 digit card: ");
                    pm = new creditCardPayment(sc.next()); }
                else if (pch == 2) {
                    System.out.print("UPI ID: ");
                    String upi = sc.nextLine().trim();
                    pm = new UpiPayment(upi); }
                else if (pch == 3) pm = new WalletPayment(100000);
                else if (pch == 4) pm = new NetBankingPayment("SBI001");

                Order order = new Order(customer, customer.getCart(), pm);
                if (order.checkout()) {
                    customer.addOrder(order);
                    customer.clearCart();
                    System.out.println("Order Placed!");
                }
            } else
                break;
        }
        sc.close();
    }
}