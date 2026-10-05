package Task5Interface;

public class SmartPhone implements Camera, Phone {

    @Override
    public void showDeviceType() {
        System.out.println(
                "This is a Smartphone with Camera and Phone features."
        );
    }
}
