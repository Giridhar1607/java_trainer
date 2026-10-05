package Task5Interface;

public interface Camera {

    default void showDeviceType() {
        System.out.println("This is a Camera.");
    }
}
