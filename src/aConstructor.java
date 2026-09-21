public class aConstructor {
    private final String productId;
    private final String productName;
    private final double price;
    private final int quantity;

    public aConstructor(){
        this("P000","Unknown",0.0,0);
    }

    public aConstructor(String productId, String productName, double price, int quantity){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    public aConstructor(String productName, double price){
        this("AUTO",productName,price,1);
    }
    public void display(){
        System.out.println("ID: "+productId+", Name: "+productName+", Price: "+price+", Quntity: " +quantity);
    }

    public static void main(String[] args){
        aConstructor p1 = new aConstructor();
        aConstructor p2 = new aConstructor("P101","Laptop",999.99,5);
        aConstructor p3 = new aConstructor("wireless Mouse",25.50);

        System.out.println("Product details");
        p1.display();
        p2.display();
        p3.display();
    }
}
