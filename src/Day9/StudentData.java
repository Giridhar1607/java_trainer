package Day9;

import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        String[] rollNumbers = new String[n];
        int[][] marks = new int[n][3];
        int[] totals = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details for Student " + (i + 1) );
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Roll Number: ");
            rollNumbers[i] = sc.nextLine();

            System.out.println("Enter 3 Subject Marks:");
            totals[i] = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject : " + (j + 1) );
                marks[i][j] = sc.nextInt();
                totals[i] += marks[i][j];
            }
            sc.nextLine();
        }

        System.out.print("Enter starting letter to search students:");
        char startLetter = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("Students starting with '" + startLetter + "':");
        for (int i = 0; i < n; i++) {
            if (!names[i].isEmpty() && Character.toLowerCase(names[i].charAt(0)) == startLetter) {
                System.out.println(names[i] + " -> " + rollNumbers[i] );
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Top Student: " + names[maxIndex] + " with Total Marks = " + totals[maxIndex]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (totals[j] < totals[j + 1]) {

                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    String tempRoll = rollNumbers[j];
                    rollNumbers[j] = rollNumbers[j + 1];
                    rollNumbers[j + 1] = tempRoll;

                    int[] tempMarks = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMarks;
                }
            }
        }

        System.out.println("Students Sorted by Total Marks (Descending)");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " | Roll: " + rollNumbers[i] + " | Total: " + totals[i]);
        }

        System.out.print("Enter a substring to search in names: ");
        String sub = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (names[i].toLowerCase().contains(sub.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Number of students With Letter '" + sub + "': " + count);

        sc.close();
    }
}