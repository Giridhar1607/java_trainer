package Day8;

import java.util.Scanner;

abstract class vehicleHiera {
    protected String brand;
    protected String model;

    public vehicleHiera(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    public void showDetails(){
        System.out.println("Brand: "+brand+"Model: "+model);
    }
    abstract String fuelType();

    static class PetrolCar extends vehicleHiera{
        public PetrolCar(String brand, String model){
            super(brand, model);
        }
        @Override
        String fuelType(){
            return "Petrol";
        }
    }

    static class ElectricCar extends vehicleHiera{
        public ElectricCar(String brand, String model){
            super(brand, model);
        }
        @Override
        String fuelType(){
            return "Electric (Battery) ";
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Petrol car Brand: ");
        String pBrand=sc.nextLine();
        System.out.println("Enter petrol car Model: ");
        String pModel=sc.nextLine();
        vehicleHiera petrolCar =new PetrolCar(pBrand,pModel);

        System.out.println("Enter Electric car Brand: ");
        String eBrand=sc.nextLine();
        System.out.println("Enter petrol car Model: ");
        String eModel=sc.nextLine();
        vehicleHiera electricCar =new ElectricCar(pBrand,pModel);

        petrolCar.showDetails();
        System.out.println("Fuel Type: "+petrolCar.fuelType());

        electricCar.showDetails();
        System.out.println("Fuel Type: "+electricCar.fuelType());
        sc.close();
    }

}
