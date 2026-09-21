import java.util.*;
public class aprime_perfect {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        boolean isPrime=(n>1);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(n+(isPrime ? "is a prime number":"is not a prime number"));


        int sumofDivisor=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sumofDivisor+=i;
            }
        }
        boolean isPerfect =(n>0) &&(sumofDivisor==n);
        System.out.println(n+(isPerfect ? "is a Perfect number":"is NOT a Perfect number"));
    }
}
