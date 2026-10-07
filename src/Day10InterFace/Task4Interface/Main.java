package Day10InterFace.Task4Interface;

public class Main {

    public static void main(String[] args) {

        App app = new App();

        // A. Access constant using interface name
        System.out.println(
                "Using interface name: "
                        + AppConfig.APP_NAME
        );

        // B. Access constant through class object
        System.out.println("Using object: " + app.APP_NAME);

        System.out.println();

        // C. Call default method
        app.showConfig();

        System.out.println();

        // D. Call static method through interface
        AppConfig.welcomeBanner();
    }
}
