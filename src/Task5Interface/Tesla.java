package Task5Interface;

public class Tesla implements ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Tesla has started.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Tesla battery is charging.");
    }
}
