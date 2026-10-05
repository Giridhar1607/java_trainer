package Task3Interface;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck();
        Fish fish = new Fish();
        Eagle eagle = new Eagle();

        System.out.println("===== DUCK =====");
        duck.fly();
        duck.swim();

        System.out.println();

        System.out.println("===== FISH =====");
        fish.swim();

        System.out.println();

        System.out.println("===== EAGLE =====");
        eagle.fly();
    }
}
