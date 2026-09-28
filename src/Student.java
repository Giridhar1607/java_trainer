import java.util.Scanner;

class Student {
    String name;
    String rollNumber;
    int[] marks = new int[3];

    // No-arg constructor
    public Student() {
        this("Unknown", "R000", new int[]{0, 0, 0});
    }

    public Student(String name, String rollNumber) {
        this(name, rollNumber, new int[]{0, 0, 0});
    }

    public Student(String name, String rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int getTotal() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    public double getAverage() {
        return getTotal() / 3;
    }

    public void display() {
        System.out.println("Name: " + name + " | Roll: " + rollNumber +
                " | Total: " + getTotal() + " | Avg: " +  getAverage());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) );
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            String roll = scanner.nextLine();
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks for Subject " + (j + 1) + ": ");
                marks[j] = Integer.parseInt(scanner.nextLine());
            }
            students[i] = new Student(name, roll, marks);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getTotal() < students[j + 1].getTotal()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Student Records");
        for (Student s : students) {
            s.display();
        }
    }
}