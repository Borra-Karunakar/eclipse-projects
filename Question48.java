package assignment;

import java.util.*;

/*
Question 48:
Use functional interface EmployeeProcessor to:
1. Print name and salary
2. Calculate and print bonus (10%)
*/

public class Question48 {
    public static void main(String[] args) {
        List<EmployeeFun> employees = new ArrayList<>();
        employees.add(new EmployeeFun("Ravi", 60000));
        employees.add(new EmployeeFun("Lakshmi", 75000));
        employees.add(new EmployeeFun("Kiran", 50000));

        // Lambda to print name and salary
        EmployeeProcessor printDetails = e ->
            System.out.println("👤 " + e.getName() + " | Salary: ₹" + e.getSalary());

        // Lambda to calculate bonus
        EmployeeProcessor printBonus = e ->
            System.out.println("🎁 " + e.getName() + "'s Bonus: ₹" + (e.getSalary() * 0.10));

        System.out.println("📋 Employee Details:");
        for (EmployeeFun e : employees) {
            printDetails.process(e);
        }

        System.out.println("\n💰 Employee Bonuses:");
        for (EmployeeFun e : employees) {
            printBonus.process(e);
        }
    }
}

/*
📋 Employee Details:
👤 Ravi | Salary: ₹60000.0
👤 Lakshmi | Salary: ₹75000.0
👤 Kiran | Salary: ₹50000.0

💰 Employee Bonuses:
🎁 Ravi's Bonus: ₹6000.0
🎁 Lakshmi's Bonus: ₹7500.0
🎁 Kiran's Bonus: ₹5000.0
*/