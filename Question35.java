package assignment;

import java.util.Scanner;

/*
Question 35:
Validate employee code using custom exception "InvalidEmployeeCode".
*/

public class Question35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Code (3 characters): ");
            String code = scanner.nextLine();

            // Check for exactly 3 characters
            if (code.length() != 3) {
                throw new InvalidEmployeeCode("Employee code must be exactly 3 characters!");
            }

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            Employee emp = new Employee(code, name, age);
            System.out.println("\n--- Employee Details ---");
            emp.printDetails();

        } catch (InvalidEmployeeCode e) {
            System.out.println("Invalid: " + e.getMessage());
        }

        scanner.close();
    }
}


/*

Enter Employee Code (3 characters): A12
Enter Name: Karunakar
Enter Age: 24

--- Employee Details ---
Employee Code : A12
Employee Name : Karunakar
Employee Age  : 24
*/