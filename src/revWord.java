import java.util.*;
public class revWord {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String text=sc.nextLine();

        String[] words =text.split(" ");
        StringBuilder result=new StringBuilder();

        for(int i=0;i< words.length;i++){
            StringBuilder revword= new StringBuilder(words[i]).reverse();
            result.append(revword);

            if(i< words.length-1){
                result.append(" ");
            }
        }
        System.out.println("output: "+result.toString());
    }
}
