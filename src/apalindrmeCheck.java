import java.util.*;
public class apalindrmeCheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string");
        String str=sc.nextLine();

        int left=0;
        int right=str.length()-1;
        boolean isPalindrome =true;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Result: "+(isPalindrome ? "palindrome":"Not A Palindrome"));
        sc.close();

    }
}
