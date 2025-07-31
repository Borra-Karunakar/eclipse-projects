package assignment;

public class EmployeeService {

    public void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("❌ Invalid salary: Salary cannot be negative.");
        }
    }

    public void processSalary(EmpSalary emp) throws InvalidSalaryException {
        validateSalary(emp.getSalary());
        System.out.println("✅ Salary processed for " + emp);
    }

    public void startProcess(EmpSalary emp) throws InvalidSalaryException {
        processSalary(emp);
    }
}
