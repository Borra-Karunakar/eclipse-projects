package assignment;

import java.io.*;
import java.util.Scanner;

/*
Question 38:
Create a class EmpRecord (instead of Employee).
Serialize and Deserialize the object.
emp_sal must be transient (not saved during serialization).
*/

class EmpRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    int emp_id;
    String emp_name;
    transient double emp_sal; // will NOT be serialized

    public EmpRecord(int id, String name, double sal) {
        this.emp_id = id;
        this.emp_name = name;
        this.emp_sal = sal;
    }

    public void printDetails() {
        System.out.println("Employee ID    : " + emp_id);
        System.out.println("Employee Name  : " + emp_name);
        System.out.println("Employee Salary: " + emp_sal); // will show 0.0 after deserialization
    }
}

public class Question38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double sal = scanner.nextDouble();

        // Step 2: Create EmpRecord object
        EmpRecord emp = new EmpRecord(id, name, sal);

        // Step 3: Serialize the object to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empRecord.ser"))) {
            oos.writeObject(emp);
            System.out.println("\n✅ EmpRecord object serialized to empRecord.ser");
        } catch (IOException e) {
            System.out.println("❌ Error during serialization: " + e.getMessage());
        }

        // Step 4: Deserialize the object from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empRecord.ser"))) {
            EmpRecord deserializedEmp = (EmpRecord) ois.readObject();
            System.out.println("\n📄 Deserialized EmpRecord:");
            deserializedEmp.printDetails(); // Salary should be 0.0
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error during deserialization: " + e.getMessage());
        }

        scanner.close();
    }
}

/*
 * Enter Employee ID: 105
Enter Employee Name: Karunakar
Enter Employee Salary: 70000

✅ EmpRecord object serialized to empRecord.ser

📄 Deserialized EmpRecord:
Employee ID    : 105
Employee Name  : Karunakar
Employee Salary: 0.0
*/
