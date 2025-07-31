package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Question 31:
Demonstrate InputMismatchException and StringIndexOutOfBoundsException.


*/

public class Question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. InputMismatchException
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  // will throw if user enters string
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: " + e.getMessage());
        }

        // 2. StringIndexOutOfBoundsException
        try {
            String text = "Hello";
            System.out.println("\nAccessing character at position 10 in \"" + text + "\"");
            char ch = text.charAt(10); // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        scanner.close();
    }
}

/*
Output:
Enter an integer: abc
Caught InputMismatchException: For input string: "abc"

Accessing character at position 10 in "Hello"
Caught StringIndexOutOfBoundsException: String index out of range: 10
*/
