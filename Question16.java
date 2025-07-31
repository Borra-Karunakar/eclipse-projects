
package assignment;

import java.util.Scanner;

/*
Question 16:
Write a program that prompts user for the mark (between 0-100 in int) of 3 students;
computes the average (in double); and prints the result rounded to 2 decimal places.
Your program needs to perform input validation.

For example:
Enter the mark (0-100) for student 1: 56
Enter the mark (0-100) for student 2: 101
Invalid input, try again...
Enter the mark (0-100) for student 2: -1
Invalid input, try again...
Enter the mark (0-100) for student 2: 99
Enter the mark (0-100) for student 3: 45
The average is: 66.67
*/

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[3]; // Store marks of 3 students
        int count = 0;

        // Loop to accept valid inputs only
        while (count < 3) {
            System.out.print("Enter the mark (0-100) for student " + (count + 1) + ": ");
            int input = scanner.nextInt();

            // Validate the input range
            if (input >= 0 && input <= 100) {
                marks[count] = input;
                count++;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }

        // Calculate average
        double average = (marks[0] + marks[1] + marks[2]) / 3.0;

        // Print the result rounded to 2 decimal places
        System.out.printf("The average is: %.2f\n", average);

        scanner.close();
    }
}

/* OUTPUT:
 Enter the mark (0-100) for student 1: 56
Enter the mark (0-100) for student 2: 101
Invalid input, try again...
Enter the mark (0-100) for student 2: -1
Invalid input, try again...
Enter the mark (0-100) for student 2: 99
Enter the mark (0-100) for student 3: 45
The average is: 66.67

*/