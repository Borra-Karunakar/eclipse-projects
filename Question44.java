package assignment;

import java.util.*;

/*
Question 44:
Sort Employee list by:
1. Salary (descending) using Comparator
2. Name (alphabetically) using Lambda
*/

class EmployeeRecord {
    private int id;
    private String name;
    private double salary;

    public EmployeeRecord(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}

public class Question44 {
    public static void main(String[] args) {
        List<EmployeeRecord> employees = new ArrayList<>();

        // Sample data
        employees.add(new EmployeeRecord(101, "Ravi", 55000));
        employees.add(new EmployeeRecord(102, "Anjali", 75000));
        employees.add(new EmployeeRecord(103, "Manoj", 65000));
        employees.add(new EmployeeRecord(104, "Bharath", 75000));
        employees.add(new EmployeeRecord(105, "Kavya", 50000));

        // Sort by salary (descending) using Comparator
        employees.sort(new Comparator<EmployeeRecord>() {
            public int compare(EmployeeRecord e1, EmployeeRecord e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });

        System.out.println("🔽 Sorted by Salary (Descending):");
        for (EmployeeRecord e : employees) {
            System.out.println(e);
        }

        // Sort by name (ascending) using lambda
        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

        System.out.println("\n🔤 Sorted by Name (Alphabetically):");
        for (EmployeeRecord e : employees) {
            System.out.println(e);
        }
    }
}

/*
🔽 Sorted by Salary (Descending):
ID: 102, Name: Anjali, Salary: ₹75000.0
ID: 104, Name: Bharath, Salary: ₹75000.0
ID: 103, Name: Manoj, Salary: ₹65000.0
ID: 101, Name: Ravi, Salary: ₹55000.0
ID: 105, Name: Kavya, Salary: ₹50000.0

🔤 Sorted by Name (Alphabetically):
ID: 102, Name: Anjali, Salary: ₹75000.0
ID: 104, Name: Bharath, Salary: ₹75000.0
ID: 105, Name: Kavya, Salary: ₹50000.0
ID: 103, Name: Manoj, Salary: ₹65000.0
ID: 101, Name: Ravi, Salary: ₹55000.0
*/