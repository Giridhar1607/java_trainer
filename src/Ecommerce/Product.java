package Ecommerce;

import java.util.regex.Pattern;

public abstract class Product implements Discountable{
    private String ProductId;
    private String name;
    private double price;


    public Product(String ProductId, String name, double price) {
        setProductId(ProductId);
        setName(name);
        setPrice(price);
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        if (!Pattern.matches("P\\d{4}", ProductId)) {
            throw new IllegalArgumentException("Id must be like P1001");
        }
        this.ProductId=ProductId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name Requied");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.price = price;
    }

    public abstract double getFinalPrice();


    public String toString() {
        return ProductId + ", " + name + ",Base " + price + "|Final: " + getFinalPrice();
    }

    public abstract double applyDiscount(double extrapercent);
}

