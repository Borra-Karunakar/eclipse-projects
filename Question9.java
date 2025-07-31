/*9.A shopkeeper sells three products whose retail prices are as follows: 
Product 1 - 22.50
              Product 2 - 44.50 
              Product 3 - 9.98
Write an application that reads a series of pairs of numbers as follows:
 a) Product number 
 b) Quantity sold

                The application should use a switch statement to determine the retail price for each product. It 
should calculate and display the total retail value of all products sold.  */
package assignment;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0; // Total retail value

        char more = 'Y';  // ✅ Initialize with 'Y' to enter the loop

        do {
            // Ask for product number
            System.out.print("Enter product number (1, 2, or 3): ");
            int productNumber = scanner.nextInt();

            // Ask for quantity sold
            System.out.print("Enter quantity sold: ");
            int quantity = scanner.nextInt();

            double price = 0.0;

            // Determine price using switch
            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number!");
                    continue; // Skip rest and go to next loop
            }

            // Add to total
            total += price * quantity;

            // Ask to enter another product
            System.out.print("Do you want to enter another product? (Y/N): ");
            more = scanner.next().charAt(0);
            more = Character.toUpperCase(more);

        } while (more == 'Y');

        // Print total
        System.out.printf("Total retail value of all products sold: ₹%.2f\n", total);

        scanner.close();
    }
    
    /* Enter product number (1, 2, or 3): 2
Enter quantity sold: 3
Do you want to enter another product? (Y/N): y
Enter product number (1, 2, or 3): 1
Enter quantity sold: 2
Do you want to enter another product? (Y/N): n
Total retail value of all products sold: ₹156.50
*/
}
