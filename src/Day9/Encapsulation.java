package Day9;

import java.util.Scanner;

class Encapsulation {
    private String name;
    private final String rollNumber;
    private int[] marks;

    public Encapsulation(String name, String rollNumber, int[] marks) {
        setName(name);

        this.rollNumber =  rollNumber;

        this.marks = new int[3];

        if (marks != null && marks.length == 3) {
            for (int i = 0; i < 3; i++) {
                setMarks(i, marks[i]);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int index, int mark) {
        if (index >= 0 && index < 3 && mark >= 0 && mark <= 100) {
            marks[index] = mark;
        }
    }

    public int getTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double getAverage() {
        return getTotal() / 3;
    }

    public boolean isPassed() {
        return getAverage() >= 40;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Result: " + (isPassed() ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();

        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1)+" " );
            marks[i] = Integer.parseInt(scanner.nextLine());
        }

        Encapsulation student = new Encapsulation(name, rollNumber, marks);

        student.display();
    }
}
