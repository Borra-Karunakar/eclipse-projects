/* 8.Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/
package assignment;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Take number of classes held
        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        // Take number of classes attended
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Calculate attendance percentage
        double percentage = (attendedClasses * 100.0) / totalClasses;

        // Print percentage
        System.out.printf("Attendance Percentage: %.2f%%\n", percentage);

        // Ask if student has medical cause
        System.out.print("Do you have a medical cause? (Y/N): ");
        char medicalCause = scanner.next().charAt(0); // Reads first character

        // Convert to uppercase for comparison
        medicalCause = Character.toUpperCase(medicalCause);

        // Check attendance and medical condition
        if (percentage >= 70 || medicalCause == 'Y') {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("You are NOT allowed to sit in the exam.");
        }

        // Close scanner
        scanner.close();
    }
}
/* Enter the number of classes held: 100
Enter the number of classes attended: 60
Attendance Percentage: 60.00%
Do you have a medical cause? (Y/N): y
You are allowed to sit in the exam.
*/
