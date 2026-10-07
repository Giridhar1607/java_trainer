package Day11Ecommerce;
public class GroceryProduct extends Product {
    private boolean nearExpiry;
    public GroceryProduct(String id, String name,double price,boolean nearExpiry){
        super(id,name,price);
        this.nearExpiry=nearExpiry;
    }
    @Override
    public double getFinalPrice(){
        return nearExpiry? getPrice()*0.90:getPrice();
    }
    @Override
    public double applyDiscount(double percent){
        return getFinalPrice()*(1-percent/100);
    }
}
