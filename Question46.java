package assignment;

import java.util.List;

/*
Question 46:
Create a generic Repository<T, ID> and test with EmployeeRepoEntity.
*/

public class Question46 {
    public static void main(String[] args) {
        Repository<EmployeeRepoEntity, Integer> repo = new Repository<>();

        // Add employees
        repo.save(101, new EmployeeRepoEntity(101, "Ravi", 60000));
        repo.save(102, new EmployeeRepoEntity(102, "Lakshmi", 75000));
        repo.save(103, new EmployeeRepoEntity(103, "Kiran", 55000));

        // Retrieve and print all
        System.out.println("📋 All Employees:");
        List<EmployeeRepoEntity> all = repo.findAll();
        for (EmployeeRepoEntity e : all) {
            System.out.println(e);
        }

        // Retrieve by ID
        System.out.println("\n🔎 Employee with ID 102:");
        System.out.println(repo.findById(102));

        // Delete by ID
        repo.deleteById(101);

        // Remaining employees
        System.out.println("\n🗑️ After Deleting ID 101:");
        for (EmployeeRepoEntity e : repo.findAll()) {
            System.out.println(e);
        }
    }
}


/*
📋 All Employees:
ID: 101, Name: Ravi, Salary: ₹60000.0
ID: 102, Name: Lakshmi, Salary: ₹75000.0
ID: 103, Name: Kiran, Salary: ₹55000.0

🔎 Employee with ID 102:
ID: 102, Name: Lakshmi, Salary: ₹75000.0

🗑️ After Deleting ID 101:
ID: 102, Name: Lakshmi, Salary: ₹75000.0
ID: 103, Name: Kiran, Salary: ₹55000.0
*/