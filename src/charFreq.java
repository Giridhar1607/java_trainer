import java.util.Scanner;

public class charFreq {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");
        String input=sc.nextLine();

        int[] freqcount = new int[256];

        for(int i=0;i<input.length();i++){
            freqcount[input.charAt(i)]++;
        }
        char resultchar='\0';
        for(int i=0;i<input.length();i++){
            if(freqcount[input.charAt(i)]==1){
                resultchar=input.charAt(i);
                break;
            }
        }
        if(resultchar!='\0'){
            System.out.println("first non-reapting character is :"+resultchar);
        }else{
            System.out.println("No non- repeat character found.");
        }
    }
}
