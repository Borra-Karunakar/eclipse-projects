package assignment;

/*
Question 47:
Custom checked exception (InvalidSalaryException) with call chain:
startProcess() → processSalary() → validateSalary()
*/

public class Question47 {
    public static void main(String[] args) {
        EmpSalary emp = new EmpSalary(101, "Karunakar", -50000); // invalid salary
        EmployeeService service = new EmployeeService();

        try {
            service.startProcess(emp);
        } catch (InvalidSalaryException e) {
            System.out.println("🚫 Exception Caught in Main:");
            System.out.println(e.getMessage());
        }
    }
}

/*
🚫 Exception Caught in Main:
❌ Invalid salary: Salary cannot be negative.
*/