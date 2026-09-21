import java.util.Scanner;

public class voweCount {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String text =sc.nextLine();

        int vowelCount=0;
        int WordCount=0;

        if(text !=null && !text.isEmpty()){
            WordCount=1;
            for(int i=0;i<text.length();i++){
                char ch = text.charAt(i);
                if(ch==' '){
                    WordCount++;
                }
                char lowerch =Character.toLowerCase(ch);
                if(lowerch=='a' || lowerch=='e'||lowerch=='i'||lowerch=='o'||lowerch=='u'){
                    vowelCount++;
                }
            }
        }
        System.out.println("Vowels: "+vowelCount);
        System.out.println("Words: " +WordCount);

    }
}
