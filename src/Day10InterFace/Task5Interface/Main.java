package Day10InterFace.Task5Interface;

public class Main {

    public static void main(String[] args) {


        System.out.println("===== ELECTRIC VEHICLE =====");

        Tesla tesla = new Tesla();

        tesla.start();
        tesla.chargeBattery();

        System.out.println();


        System.out.println("===== DEFAULT METHOD CONFLICT =====");

        SmartPhone smartphone = new SmartPhone();

        smartphone.showDeviceType();
    }
}
