import java.util.Scanner;

public class reportcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"English", "Hindi", "Science", "Computer", "Sanskrit"};

        int numStudents = 5;
        int[][] marks = new int[numStudents][subjects.length];
        int[] totalMarks = new int[numStudents];

        for (int student = 0; student < numStudents; student++) {
            System.out.println("\nEnter marks for Student " + (student + 1) + ":");
            for (int subjectIndex = 0; subjectIndex < subjects.length; subjectIndex++) {
                System.out.print(subjects[subjectIndex] + ": ");
                marks[student][subjectIndex] = scanner.nextInt();
                totalMarks[student] += marks[student][subjectIndex];
            }
        }

        System.out.println("\n--- Report Card ---");
        for (int student = 0; student < numStudents; student++) {
            System.out.println("\nReport Card for Student " + (student + 1) + ":");
            for (int subjectIndex = 0; subjectIndex < subjects.length; subjectIndex++) {
                System.out.println(subjects[subjectIndex] + ":\t\t" + marks[student][subjectIndex]);
            }
            System.out.println("Total Marks:\t" + totalMarks[student]);
        }

        scanner.close();
    }
}
