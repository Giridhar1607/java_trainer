public class book {
    String title;
    String author;
    double price;

    public book() {
        this.title = "unknown";
        this.author = "unknown";
        this.price = 0.0;
    }

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 100.0;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + " || Author: " + author + "|| price: " + price);
    }


    public static void main(String[] args) {

        book book1 = new book();
        book book2 = new book("apple", "joshua");
        book book3 = new book("clean", "Robert");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

    }
}