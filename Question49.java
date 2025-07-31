package assignment;

import java.util.Optional;

/*
Question 49:
Use Optional to handle missing fields and provide defaults or throw custom exceptions.
*/

public class Question49 {
    public static void main(String[] args) {
        // Example 1: Employee with all fields
        EmployeeOptional emp1 = new EmployeeOptional(
                101,
                "Karunakar",
                Optional.of("karunakar@example.com"),
                Optional.of("CSE")
        );

        // Example 2: Employee with missing optional fields
        EmployeeOptional emp2 = new EmployeeOptional(
                102,
                "Akhil",
                Optional.empty(),
                Optional.empty()
        );

        // Example 3: Missing name (to trigger exception)
        EmployeeOptional emp3 = new EmployeeOptional(
                103,
                "",
                Optional.of("no-name@example.com"),
                Optional.of("HR")
        );

        printEmployeeDetails(emp1);
        printEmployeeDetails(emp2);
        printEmployeeDetails(emp3); // should throw custom exception
    }

    public static void printEmployeeDetails(EmployeeOptional emp) {
        System.out.println("\n🧾 Employee ID: " + emp.getId());

        try {
            System.out.println("Name: " + emp.getName());
        } catch (MissingRequiredFieldException e) {
            System.out.println("⚠️ " + e.getMessage());
            return;
        }

        // Provide default email and department if missing
        String email = emp.getEmail().orElse("📭 Email not provided");
        String dept = emp.getDepartment().orElse("🏢 Department not specified");

        System.out.println("Email: " + email);
        System.out.println("Department: " + dept);
    }
}

/*

🧾 Employee ID: 101
Name: Karunakar
Email: karunakar@example.com
Department: CSE

🧾 Employee ID: 102
Name: Akhil
Email: 📭 Email not provided
Department: 🏢 Department not specified

🧾 Employee ID: 103
⚠️ ❌ Name is required but missing!
*/