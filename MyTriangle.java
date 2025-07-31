package assignment;

import java.util.Scanner;

/*
Question 25:
Static methods: isValid, area, perimeter
Loop until a == -1
*/

public class MyTriangle {

    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double area(double a, double b, double c) {
        double s = perimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter side a (or -1 to exit): ");
            double a = scanner.nextDouble();

            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            if (isValid(a, b, c)) {
                System.out.printf("Perimeter: %.2f\n", perimeter(a, b, c));
                System.out.printf("Area: %.2f\n", area(a, b, c));
            } else {
                System.out.println("The input is invalid.");
            }

            System.out.println(); // spacing for next iteration
        }

        scanner.close();
    }
}

/*
Run:
Enter side a (or -1 to exit): 3
Enter side b: 4
Enter side c: 5
Perimeter: 12.00
Area: 6.00

Enter side a (or -1 to exit): 1
Enter side b: 2
Enter side c: 10
The input is invalid.

Enter side a (or -1 to exit): -1
Bye~
*/
