 public class Construbook {
     String title;
     String author;
     double price;

     public Construbook() {
         this.title = "unknown";
         this.author = "unknown";
         this.price = 0.0;
     }

     public Construbook(String title, String author, double price) {
         this.title = title;
         this.author = author;
         this.price = price;
     }

     public Construbook(String title, String author) {
         this.title = title;
         this.author = author;
         this.price = 100.0;
     }

     public void displayDetails() {
         System.out.println("Title: " + title + " || Author: " + author + "|| price: " + price);
     }


     public static void main(String[] args) {

         Construbook book1 = new Construbook();
         Construbook book2 = new Construbook("apple", "joshua");
         Construbook book3 = new Construbook("clean", "Robert");

         book1.displayDetails();
         book2.displayDetails();
         book3.displayDetails();

     }
 }
