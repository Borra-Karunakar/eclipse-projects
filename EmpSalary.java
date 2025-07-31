package assignment;

public class EmpSalary {
    private int id;
    private String name;
    private double salary;

    public EmpSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Emp ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
