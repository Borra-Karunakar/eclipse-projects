/*6.A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
package assignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter marks
        System.out.print("Enter your marks (0 - 100): ");
        int marks = scanner.nextInt();

        // Use if-else ladder to determine grade
        if (marks < 0 || marks > 100) {
            // Input validation: marks should be between 0 and 100
            System.out.println("Invalid marks. Please enter between 0 and 100.");
        } else if (marks < 25) {
            System.out.println("Grade: F");
        } else if (marks <= 45) {
            System.out.println("Grade: E");
        } else if (marks <= 50) {
            System.out.println("Grade: D");
        } else if (marks <= 60) {
            System.out.println("Grade: C");
        } else if (marks <= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: A");
        }

        // Close scanner
        scanner.close();
    }
}
/* Enter your marks (0 - 100): 73
Grade: B
*/