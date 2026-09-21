import java.util.*;
public class avowelTitle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a sentence");
        String sentence =sc.nextLine();

        int wordCount=0;
        int vowelCount=0;
        boolean inWord= false;

        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);

            char lowerch= Character.toLowerCase(ch);
            if(lowerch=='a'|| lowerch=='e'||lowerch=='i'||lowerch=='o'||lowerch=='u'){
                vowelCount++;
            }

            if(!Character.isWhitespace(ch)){
                if(!inWord){
                    wordCount++;
                    inWord=true;
                }
            }else{
                inWord=false;
            }
        }
        System.out.println("NUmber of word: "+wordCount);
        System.out.println("Number of vowels: "+vowelCount);

        StringBuilder titleCase = new StringBuilder();
        boolean capitalizeNext=true;

        for(int i=0;i<sentence.length();i++){
            char ch= sentence.charAt(i);

            if(Character.isWhitespace(ch)){
                capitalizeNext=true;
                titleCase.append(ch);
            }else if(capitalizeNext){
                titleCase.append(Character.toUpperCase(ch));
                capitalizeNext=false;
            }else{
                titleCase.append(Character.toLowerCase(ch));
            }
        }
        System.out.println("Title Case: "+titleCase.toString());
        sc.close();
    }
}
