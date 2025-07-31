/* 7.A student will not be allowed to sit in exam if his/her attendence is less than 70%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
package assignment;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of classes held
        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        // Ask user for number of classes attended
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Calculate attendance percentage
        double attendancePercentage = (attendedClasses * 100.0) / totalClasses;

        // Print percentage
        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);

        // Check if student is allowed to sit in exam
        if (attendancePercentage >= 70) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("You are NOT allowed to sit in the exam.");
        }

        // Close the scanner
        scanner.close();
    }
}

/*Enter the number of classes held: 100
Enter the number of classes attended: 68
Attendance Percentage: 68.00%
You are NOT allowed to sit in the exam.
 */
