import java.util.*;
public class palindromeCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sting: ");
        String text=sc.nextLine();

        boolean ispalindrome =true;
        int len = text.length();

        for(int i=0;i<len/2;i++){
            if(text.charAt(i)!=text.charAt(len-1-i)){
                ispalindrome =false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
          sc.close();
    }
}
