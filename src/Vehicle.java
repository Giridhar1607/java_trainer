public class Vehicle {
    private String brand;
    private double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    static class Car extends Vehicle {
        private String fuelType;

        public Car(String brand, double speed, String fuelType) {
            super(brand, speed);
            this.fuelType = fuelType;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Fuel Type: " + fuelType);
        }
    }

    static class ElectricCar extends Car {
        private int batteryCapacity;

        public ElectricCar(String brand, double speed, int batteryCapacity) {
            super(brand, speed, "Electric");
            this.batteryCapacity = batteryCapacity;
        }

        public void charge() {
            System.out.println("Charging the " + batteryCapacity + " kWh battery...");
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        }
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 210.0, 85);
        tesla.display();
        tesla.charge();
    }
}

