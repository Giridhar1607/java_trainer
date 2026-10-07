package Day12javaExcaption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr={10,20,30,40,50};

        while(true){
            try{
                System.out.println("Enter Numerator");
                double a=sc.nextDouble();
                System.out.println("enter Denominator");
                double b=sc.nextDouble();

                if(b==0) throw new ArithmeticException("Denominator is zero");
                double result=a/b;
                System.out.println("Result: "+result);
                break;
            }catch (ArithmeticException e){
                System.out.println("Error: cannot divide by Zero.Try Again");
            }catch (InputMismatchException e){
                System.out.println("Error please enter number only");
                sc.next();
            }
        }

        while(true){
            try{
                System.out.println("Enter index 0-4 to read");
                int index=sc.nextInt();
                System.out.println("Element at index "+index+" is "+arr[index]);
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: index out of range .Valid 0-4");
            }catch (InputMismatchException e){
                System.out.println("Error: Enter valid integer");
                sc.next();
            }
        }
    }
}
