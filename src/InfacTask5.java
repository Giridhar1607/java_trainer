interface Vehicle{
    void start();
}

interface ElectricVehicle extends Vehicle{
    void chargeBattery();
}

class Tesla implements ElectricVehicle{
    public void start(){
        System.out.println("Tesla Started silently");
    }
    @Override
    public void chargeBattery(){
        System.out.println("Charge Tesla Battery via super charger ");
    }
}

interface  Engine{
    default void serviceInfo(){
        System.out.println("Engine service require every 10,000 miles");
    }
}

interface Battery{
    default void serviceInfo(){
        System.out.println("Battery Check required every 20,000 miles");
    }
}

class HybridCar implements Engine, Battery{
    @Override
    public void serviceInfo(){
        System.out.println("Car custom check");
    }
}

public class InfacTask5 {
    public static void main(String[] args){
        Tesla modelS=new Tesla();
        modelS.start();
        modelS.chargeBattery();

        HybridCar prius=new HybridCar();
        prius.serviceInfo();

    }
}
