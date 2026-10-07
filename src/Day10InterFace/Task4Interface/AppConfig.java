package Day10InterFace.Task4Interface;

public interface AppConfig {

    String APP_NAME = "My Java Application";

    default void showConfig() {
        System.out.println("Application Name: " + APP_NAME);
        System.out.println("Version: 1.0");
        System.out.println("Environment: Development");
    }

    static void welcomeBanner() {
        System.out.println("==============================");
        System.out.println("   Welcome to " + APP_NAME);
        System.out.println("==============================");
    }
}
