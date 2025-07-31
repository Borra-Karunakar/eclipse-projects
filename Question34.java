package assignment;

import java.util.Scanner;

/*
Question 34:
Create a class Employee with members:
- Employee ID (String, format: YY-D-XXX)
- Name (String)
- Year of Birth (int)

Example ID: 81-F-112 or 79-S-254
*/

public class Question34 {

    static class Employee {
        private String empId;
        private String name;
        private int yearOfBirth;

        // Additional parsed fields
        private String designationCode;
        private String idYear;
        private String idNumber;

        public Employee(String empId, String name, int yearOfBirth) {
            this.empId = empId;
            this.name = name;
            this.yearOfBirth = yearOfBirth;

            // Parse empId into parts: year-designation-number
            String[] parts = empId.split("-");

            if (parts.length == 3) {
                this.idYear = parts[0];
                this.designationCode = parts[1];
                this.idNumber = parts[2];
            } else {
                System.out.println("Invalid Employee ID format.");
            }
        }

        public void printDetails() {
            System.out.println("Employee Name   : " + name);
            System.out.println("Year of Birth   : " + yearOfBirth);
            System.out.println("Employee ID     : " + empId);
            System.out.println("Parsed Year     : " + idYear);
            System.out.println("Designation     : " + (designationCode.equals("F") ? "Faculty" : "Staff"));
            System.out.println("Serial Number   : " + idNumber);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID (format: YY-D-XXX): ");
        String empId = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Year of Birth: ");
        int yob = scanner.nextInt();

        Employee emp = new Employee(empId, name, yob);
        System.out.println("\n--- Employee Details ---");
        emp.printDetails();

        scanner.close();
    }
}

/*
 Input:
Enter Employee ID (format: YY-D-XXX): 81-F-112
Enter Name: Karunakar
Enter Year of Birth: 2001

 Output:
Employee Name   : Karunakar
Year of Birth   : 2001
Employee ID     : 81-F-112
Parsed Year     : 81
Designation     : Faculty
Serial Number   : 112
*/
