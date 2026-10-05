package Task6Interface;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(2500);


        Payment creditCard =
                new CreditCardPayment("1234567890123456");

        cart.checkout(creditCard);



        Payment upi =
                new UpiPayment("rahul@upi");

        cart.checkout(upi);



        Payment cod =
                new CashOnDelivery();

        cart.checkout(cod);



        Payment invalidCard =
                new CreditCardPayment("12345");

        cart.checkout(invalidCard);



        Payment invalidUpi =
                new UpiPayment("rahulupi");

        cart.checkout(invalidUpi);
    }
}
