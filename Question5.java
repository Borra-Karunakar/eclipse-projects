/* 5.A company decided to give bonus of 10% to employee if his/her year of service is more than 6 years.
Ask user for their salary and year of service and print the net bonus amount.

*/package assignment;

// Import Scanner class for taking user input
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();  // Read salary as double

        // Ask user to enter their years of service
        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();  // Read years as integer

        // Check if years of service is greater than 6
        if (years > 6) {
            // Calculate 10% bonus
            double bonus = salary * 0.10;

            // Print the bonus amount
            System.out.println("You are eligible for a bonus of ₹" + bonus);
        } else {
            // Print if not eligible
            System.out.println("You are not eligible for a bonus.");
        }

        // Close the scanner to prevent memory leak
        scanner.close();
    }
}
/* Enter your salary: 50000
Enter your years of service: 7
You are eligible for a bonus of ₹5000.0
*/

