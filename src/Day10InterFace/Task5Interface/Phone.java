package Day10InterFace.Task5Interface;

public interface Phone {

    default void showDeviceType() {
        System.out.println("This is a Phone.");
    }
}
