import java.util.*;
public class StudGradeCal {
    private String name;
    private int[] marks;

    public StudGradeCal(String name,int[] marks){
        this.name=name;
        this.marks=Arrays.copyOf(marks,marks.length);
    }

    public String getName(){
        return name;
    }
    public int[] getMarks(){
        return Arrays.copyOf(marks,marks.length);
    }

    public double getAverage(){
        if(marks.length==0) return 0.0;
        int sum=0;
        for(int mark:marks){
            sum+=mark;
        }
        return (double) sum/ marks.length;
    }
    public char getGrade(){
        double avg=getAverage();
        if(avg>=90) return 'A';
        if(avg>=75) return 'B';
        if(avg>=60) return 'C';
        if(avg>=40) return 'D';
        return 'F';
    }
    public void printGradeCard(){
        System.out.println("---------------");
        System.out.println("Student Name: "+name);
        System.out.println("Marks "+Arrays.toString(marks));
        System.out.println("Average: %.2f%%f" +getAverage());
        System.out.println("Grade : "+getGrade());
        System.out.println("---------------");
    }
    public static void main(String[] args){
        StudGradeCal s1=new StudGradeCal("Giridhar",new int[]{92,88,95,91,94});
        StudGradeCal s2=new StudGradeCal("Sai",new int[]{70,65,80,72,68});
        StudGradeCal s3= new StudGradeCal("Mahesh",new int[]{35,42,50,38,29});

        s1.printGradeCard();
        s2.printGradeCard();
        s3.printGradeCard();


    }
}
