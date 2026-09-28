class StudentClass {
    String name;
    String rollNumber;
    int[] marks;

    // 1. No-arg constructor
    public StudentClass() {
        this("Unknown", "R000", new int[]{0, 0, 0});
    }

    // 2. Constructor with name and roll number only (chains via this())
    public StudentClass(String name, String rollNumber) {
        this(name, rollNumber, new int[]{0, 0, 0});
    }

    // 3. Parameterized constructor
    public StudentClass(String name, String rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = (marks != null && marks.length == 3) ? marks : new int[]{0, 0, 0};
    }

    public int getTotal() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public void display() {
        System.out.printf("%-12s | Roll: %-6s | Marks: [%3d, %3d, %3d] | Total: %3d | Avg: %.2f\n",
                name, rollNumber, marks[0], marks[1], marks[2], getTotal(), getAverage());
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Alice", "S101", new int[]{85, 90, 88}),
                new Student("Bob", "S102", new int[]{70, 60, 65}),
                new Student("Charlie", "S103", new int[]{95, 92, 98}),
                new Student("David", "S104") // Uses constructor chaining
        };

        System.out.println("--- All Students ---");
        for (Student s : students) {
            s.display();
        }

        // Search by starting letter
        char letter = 'a';
        System.out.println("\nStudents starting with '" + letter + "':");
        for (Student s : students) {
            if (s.name.toLowerCase().startsWith(String.valueOf(letter))) {
                s.display();
            }
        }

        // Top student
        Student top = students[0];
        for (Student s : students) {
            if (s.getTotal() > top.getTotal()) {
                top = s;
            }
        }
        System.out.println("\nTop Student: " + top.name + " (" + top.getTotal() + " marks)");

        // Sort descending by total marks (Selection Sort)
        for (int i = 0; i < students.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getTotal() > students[maxIdx].getTotal()) {
                    maxIdx = j;
                }
            }
            Student temp = students[i];
            students[i] = students[maxIdx];
            students[maxIdx] = temp;
        }

        System.out.println("\n--- Sorted Students ---");
        for (Student s : students) {
            s.display();
        }
    }
}