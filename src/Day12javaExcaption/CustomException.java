package Day12javaExcaption;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}


class InsufficientAttendanceException extends Exception {
    public InsufficientAttendanceException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int marks;
    private double attendance;

    public Student(String name) { this.name = name; }

    public void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks for " + name + ": " + marks + ". Marks must be 0-100");
        }
        this.marks = marks;
        System.out.println(name + " marks set to " + marks);
    }

    public void setAttendance(double attendance)
            throws InsufficientAttendanceException {
        if (attendance < 75) {
            throw new InsufficientAttendanceException("Attendance for " + name + " is " + attendance + "%, below 75% required");
        }
        this.attendance = attendance;
        System.out.println(name + " attendance OK: " + attendance + "%");
    }
}

public class CustomException {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");
        Student s3 = new Student("Aman");

        try {
            s1.setMarks(85);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage()); }
        try {
            s2.setMarks(-10);
        } catch (InvalidMarksException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        try {
            s3.setMarks(150); }
        catch (InvalidMarksException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println();
        try {
            s1.setAttendance(80); }
        catch (InsufficientAttendanceException e) {
            System.out.println(e.getMessage());
        }
        try {
            s2.setAttendance(60); }
        catch (InsufficientAttendanceException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
