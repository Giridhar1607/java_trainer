package Ecommerce;

public class ClothingProduct extends Product {
    private double seasonDiscount;

    public ClothingProduct(String id, String name,double price, double seasonDiscount){
        super(id,name,price);
        this.seasonDiscount=seasonDiscount;
    }
    @Override
    public double getFinalPrice(){
        return getPrice()*(1-seasonDiscount/100);
    }
    @Override
    public double applyDiscount(double extrapercent){
        return getFinalPrice()*(1-extrapercent/100);
    }
}