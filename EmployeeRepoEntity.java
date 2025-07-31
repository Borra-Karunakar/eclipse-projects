package assignment;

public class EmployeeRepoEntity {
    private int id;
    private String name;
    private double salary;

    public EmployeeRepoEntity(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}
