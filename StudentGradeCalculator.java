import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Student Grade Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = sc.nextInt();

        if (numOfSubjects <= 0) {
            System.out.println("Invalid number of subjects. Exiting.");
            return;
        }

        int[] marks = new int[numOfSubjects];
        int sum = 0;

        //Input of marks
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // Optional: validate marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                return;
            }

            sum += marks[i];
        }

        double avgPercentage = (double) sum / numOfSubjects;

        char grade;
        if (avgPercentage >= 95) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else if (avgPercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + sum);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercentage);
        System.out.println("Grade: " + grade);

        sc.close(); 
    }
}