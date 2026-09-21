public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+", Age: "+age);
    }
    static class Student extends Person {
        private String studentId;
        private String course;

        public Student(String name, int age,String studentId,String course ){
            super(name,age);
            this.studentId=studentId;
            this.course=course;

        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Student ID: "+studentId+", Course: "+course);
        }
    }
    public static void main(String[] args){
        Student student= new Student("Giridhar",21,"St-1088","Computer Science");
        student.displayInfo();
    }
}
