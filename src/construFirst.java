class Student{
    String name;
    int age;
    String studentId;

    public Student(String name,int age, String studentId){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
    }
    public void display(){
        System.out.println("ID: "+this.studentId+", Name: "+this.name+",Age: "+this.age);
    }
}

public class construFirst {
    public static void main(String[] args){
        Student s1=new Student("Apple",20,"S01");
        Student s2=new Student("banana",22,"S02");
        Student s3=new Student("coconut",20,"S03");

        s1.display();
        s2.display();
        s3.display();


    }
}
