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
        userprofile user=new userprofile("Giridhar","SecurePass1","giri@gmail.com");
        System.out.println("Masked Password View:"+user.getPassword());

        System.out.println("InValid Password");
        user.setPassword("short1A");
        user.setPassword("noLetter123");
        user.setPassword("NoDigitsHere");

        System.out.println("Testing Valid Password");
        user.setPassword("NewStrongPass9");

        System.out.println("Testing Password Verified");
        System.out.println("Verify 'WrongPass': "+user.verifyPassword("Wrong Pass"));
        System.out.println("Verify 'NewStrongPass9': "+user.verifyPassword("New Strong Pass9"));
    }

}

