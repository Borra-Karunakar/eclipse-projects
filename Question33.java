package assignment;

/*
Question 33:
Emp class with HRA calculation & custom exception for basic < 50000.
*/

public class Question33 {
    public static void main(String[] args) {
        try {
            Emp emp1 = new Emp(101, "Karunakar", "Manager", 60000);
            emp1.printDET();

            System.out.println();

            Emp emp2 = new Emp(102, "Ravi", "HR", 40000); // should throw exception
            emp2.printDET();

        } catch (LowSalException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
 Output:
Employee Details:
ID         : 101
Name       : Karunakar
Designation: Manager
Basic Pay  : 60000.0
HRA        : 6000.0

Exception caught: Basic salary is less than 50000. Not allowed.
*/
