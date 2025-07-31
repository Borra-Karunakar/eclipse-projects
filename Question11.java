/* 11. Create a class called Calculator which has 4 different methods add, diff, mul and div which 
accepts two numbers as parameters. Create an object to access these methods and invoke 
these methods with two numbers and display the result in the corresponding methods. 
*/
package assignment;

// Calculator class with four methods
class Calculator {
    // Method to add two numbers
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    // Method to subtract two numbers
    public void diff(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    // Method to multiply two numbers
    public void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    // Method to divide two numbers
    public void div(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

// Main class to test Calculator
public class Question11 {
    public static void main(String[] args) {
        // Create object of Calculator class
        Calculator calc = new Calculator();

        // Define two numbers
        int num1 = 20;
        int num2 = 5;

        // Call each method
        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}

/*Addition: 25
Subtraction: 15
Multiplication: 100
Division: 4.0
 */
