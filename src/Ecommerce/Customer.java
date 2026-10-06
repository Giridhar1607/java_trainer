package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User implements Discountable {
        private List<Product> cart=new ArrayList<>();
        private List<Order> orderHistory= new ArrayList<>();
        private int ordersCount=0;

    public Customer(String userId, String name) {
        super(userId, name);
    }

    public void addToCart(Product p){
        cart.add(p);
        System.out.println(p.getName()+"added to cart");
    }

    public List<Product> getCart(){
        return cart;
    }
    public void clearCart(){
        cart.clear();
    }
    public List<Order> getOrderHistory(){
        return orderHistory;
    }
    public void addOrder(Order o){
        orderHistory.add(o);
        ordersCount++;
    }

    public void displayInfo(){
        System.out.println("Customer ID"+getUserId()+"Name :"+getName()+"Orders: "+ordersCount);
    }

    public double applyDiscount(double amount){
        if(ordersCount>=5) return amount*0.85;
        if(ordersCount>=2) return amount*0.90;
        return amount;
    }

}

