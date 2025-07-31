package assignment;

import java.util.Scanner;

/*
Question 30:
Use method reference to implement a functional interface minimum3()
to find the smallest of 3 floating-point numbers using Math.min().
*/

@FunctionalInterface
interface MinFinder {
    float minimum3(float a, float b, float c);
}

public class Question30 {

    // Static method to be used with method reference
    public static float findMinimum(float a, float b, float c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float x = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float y = scanner.nextFloat();

        System.out.print("Enter third number: ");
        float z = scanner.nextFloat();

        // Method reference to static method
        MinFinder mf = Question30::findMinimum;

        float result = mf.minimum3(x, y, z);
        System.out.println("Smallest value is: " + result);

        scanner.close();
    }
}

/*
Output:
Enter first number: 3.2
Enter second number: 1.5
Enter third number: 2.8
Smallest value is: 1.5
*/
