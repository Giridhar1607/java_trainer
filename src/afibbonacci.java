import java.util.*;
public class afibbonacci {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("enter positive integer");
        }else{
            long first=0,secon=1;
            System.out.println("fibbonacci Series: ");
            for(int i=1;i<=n;i++){
                System.out.print(first+" ");
                long next=first+secon;
                first=secon;
                secon=next;
            }
            System.out.println();
        }

    }
}
