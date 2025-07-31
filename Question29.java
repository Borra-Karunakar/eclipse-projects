package assignment;

import java.util.NoSuchElementException;
import java.util.Scanner;

/*
Question 29:
Read Register Number and Mobile Number.
Throw:
- IllegalArgumentException → if length is wrong
- NumberFormatException → if mobile has non-digit
- NoSuchElementException → if register has special characters
*/

public class Question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Register Number: ");
            String regNo = scanner.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = scanner.nextLine();

            // Length check
            if (regNo.length() != 9 || mobile.length() != 10) {
                throw new IllegalArgumentException("Length invalid");
            }

            // Digits only check for mobile
            if (!mobile.matches("\\d{10}")) {
                throw new NumberFormatException("Mobile must contain only digits");
            }

            // Register number must have only letters and digits
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register number contains invalid characters");
            }

            System.out.println("Valid");

        } catch (NumberFormatException e) {
            System.out.println("Invalid: " + e);
        } catch (NoSuchElementException e) {
            System.out.println("Invalid: " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid: " + e);
        }

        scanner.close();
    }
}

/* 
 Enter Register Number: 21CSR1001
Enter Mobile Number: 9876543210
Valid

Enter Register Number: 21CSR100!
Enter Mobile Number: 9876543210
Invalid: java.util.NoSuchElementException: Register number contains invalid characters

Enter Register Number: 21CSR1001
Enter Mobile Number: 98765abc90
Invalid: java.lang.NumberFormatException: Mobile must contain only digits
*/
