interface AppConfig{
    String APP_NAME=" E- Commerce Suite";

    default void printConfigDetails(){
        System.out.println("Configuration Mode: Standard");
    }

    static void printWelcomeBanner(){
        System.out.println(" welcome to"+APP_NAME);
    }
}
class App implements AppConfig{

}

public class InfacTask4 {
    public static void main(String[] args){
        System.out.println("Access via Interface Name: "+AppConfig.APP_NAME);
        App appObj= new App();
        System.out.println("Access via Class Object: "+App.APP_NAME);

        appObj.printConfigDetails();

        AppConfig.printWelcomeBanner();

    }
}
