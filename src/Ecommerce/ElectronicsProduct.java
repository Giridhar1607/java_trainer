package Ecommerce;

public class ElectronicsProduct extends Product {
    public ElectronicsProduct(String id, String name,double price){
        super(id,name,price);
    }
    @Override
    public double getFinalPrice(){
        return getPrice()*1.18;
    }
    @Override
    public double applyDiscount(double percent){
        return getFinalPrice();
    }
}
