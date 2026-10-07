package Day9;

import java.util.Scanner;

class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void getDetails() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

class Students extends Person {
    private int[] marks;
    public Students(String name, String id, int[] marks) {
        super(name, id);
        this.marks = marks;
    }

    public int getTotal() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    @Override
    public void getDetails() {
        System.out.println("STUDENT ID: " + id + " , Name: " + name + " , Total Marks: " + getTotal()
        );
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, String id, String subject, double salary) {
        super(name, id);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void getDetails() {
        System.out.println(" TEACHER ID: " + id + " , Name: " + name + " , Subject: " + subject + " , Salary: $" + salary
        );
    }
}

class School {

    // Compile-time polymorphism: method overloading
    public void addPerson(Students s) {
        System.out.print("Student Registration ");
        s.getDetails();
    }

    public void addPerson(Teacher t) {
        System.out.print("Teacher Registration : ");
        t.getDetails();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        System.out.print("Enter Student Name: ");
        String sName = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String sId = scanner.nextLine();

        int[] marks = {85, 90, 78};

        Students student = new Students(sName, sId, marks);

        System.out.print("Enter Teacher Name: ");
        String tName = scanner.nextLine();

        System.out.print("Enter Teacher ID: ");
        String tId = scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Teacher teacher = new Teacher(tName, tId, subject, salary);

        System.out.println( "Compile-time Polymorphism -- Method Overloading"
        );

        school.addPerson(student);
        school.addPerson(teacher);

        System.out.println("Runtime Polymorphism -- Method Overriding"
        );

        Person[] directory = new Person[2];

        directory[0] = student;
        directory[1] = teacher;

        for (Person p : directory) {
            p.getDetails();
        }

        scanner.close();
    }
}
