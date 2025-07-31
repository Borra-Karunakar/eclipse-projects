package assignment;

public class Emp {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 50000) {
            throw new LowSalException("Basic salary is less than 50000. Not allowed.");
        }

        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        calculateHRA();
    }

    // HRA is read-only: no setter
    public double getHRA() {
        return hra;
    }

    // Method to calculate HRA based on designation
    private void calculateHRA() {
        switch (designation.toLowerCase()) {
            case "manager":
                hra = basic * 0.10;
                break;
            case "teamleader":
                hra = basic * 0.12;
                break;
            case "hr":
                hra = basic * 0.05;
                break;
            default:
                hra = 0;
        }
    }

    public void printDET() {
        System.out.println("Employee Details:");
        System.out.println("ID         : " + empId);
        System.out.println("Name       : " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay  : " + basic);
        System.out.println("HRA        : " + hra);
    }
}
