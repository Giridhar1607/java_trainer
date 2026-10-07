package Day11Ecommerce;

import java.util.List;

public class Admin extends User {


        public Admin(String id,String name){
            super(id,name);
        }
        public void addProducttoCatlog(List<Product> catlog, Product p){
            catlog.add(p);
            System.out.println("Admin added:"+p.getName());
        }

        public void displayInfo(){
            System.out.println("Admin :"+getUserId()+" "+getName()+", Manage catlog");
        }

}
