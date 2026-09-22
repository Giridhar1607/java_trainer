import java.util.Scanner;

public class userprofile {
    private String username;
    private String password;
    private String email;

    public userprofile(String username,String password,String email){
        this.username=username;
        this.email=email;
        if(!setPassword(password)){
            this.password="Default123";
        }
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return "******";
    }

    public boolean setPassword(String newPassword) {
        if (isValidPassword(newPassword)) {
            this.password = newPassword;
            System.out.println("password update Successfully");
            return true;
        } else {
            System.out.println("Error :Password mus be atleast 8 characterslong,contain at least 1 digit and 1 uppercase letter");
            return false;
        }
    }
    private boolean isValidPassword(String pwd) {
        if (pwd == null || pwd.length() < 8) return false;

        boolean hasDigit=false;
        boolean hasUpper=false;

        for(char c: pwd.toCharArray()){
            if(Character.isDigit(c)) hasDigit=true;
            if(Character.isUpperCase(c)) hasUpper=true;
        }
        return hasDigit && hasUpper;
    }
    public boolean verifyPassword(String input){
        return this.password.equals(input);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Create user profile");
        System.out.print("Enter username: ");
        String username=sc.nextLine();

        System.out.print("Enter Email: ");
        String email=sc.nextLine();

        System.out.print("Enter initial password: ");
        String initialpassword=sc.nextLine();

        userprofile user =new userprofile(username,initialpassword,email);
        System.out.println("prfile craeted ! Masked Pasword"+user.getPassword());

        System.out.println(" Verified Password");
        System.out.println("Enter password to verify: ");
        String attempt=sc.nextLine();

        if(user.verifyPassword(attempt)){
            System.out.println("Verification result: Sucess");
        }
        else{
            System.out.println("Verification Result: FAILED!");
        }

        System.out.println("Update Password");
        boolean update= false;
        while(!update){
            System.out.println("Enter new password(min 8 char, 1 digit,1 uppercase)");
            String newPassword=sc.nextLine();

            if(!update){
                System.out.println("PLease try again");
            }
        }
        System.out.println("Verify New Password");
        System.out.println("Enter new password to verify");
        String verifyNew=sc.nextLine();

        if(user.verifyPassword(verifyNew)){
            System.out.println("Verification Result: Sucesss!");

        }else{
            System.out.println("Verificatin Result: Failed!");
        }
        sc.close();
    }

}

