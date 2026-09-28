import java.util.Scanner;

abstract class AbstractPerson {
    protected String name;
    protected String id;

    public AbstractPerson(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void getDetails();
    public abstract String getRole();

    // Concrete Method shared across hierarchy
    public void showIdCard() {
        System.out.println("OFFICIAL ID CARD ");
        System.out.println(" Role: " + getRole());
        System.out.println(" Name: " + name);
        System.out.println(" ID:   " + id);
    }
}

class FinalStudent extends AbstractPerson {
    private int[] marks;

    public FinalStudent(String name, String id, int[] marks) {
        super(name, id);
        this.marks = marks;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public void getDetails() {
        int total = 0;
        for (int m : marks) total += m;
        System.out.println("[STUDENT] ID: " + id + " | Name: " + name + " | Total Marks: " + total);
    }
}

class FinalTeacher extends AbstractPerson {
    private String subject;

    public FinalTeacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    @Override
    public void getDetails() {
        System.out.println("[TEACHER] ID: " + id + " | Name: " + name + " | Subject: " + subject);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String sName = scanner.nextLine();
        FinalStudent student = new FinalStudent(sName, "S101", new int[]{88, 92, 79});

        System.out.print("Enter Teacher Name: ");
        String tName = scanner.nextLine();
        FinalTeacher teacher = new FinalTeacher(tName, "T501", "Computer Science");

        AbstractPerson[] members = { student, teacher };

        System.out.println("Polymorphic Details");
        for (AbstractPerson member : members) {
            member.getDetails();
        }

        System.out.println("Concrete Inherited ID Cards");
        for (AbstractPerson member : members) {
            member.showIdCard();
        }
    }
}