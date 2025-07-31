/*4.Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
 */
package assignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your field of interest: ");
        String interest = scanner.nextLine();

        System.out.println("Hey, my name is " + name + 
                           " and my roll number is " + rollNumber + 
                           ". My field of interest is " + interest + ".");

        scanner.close();
    }
}
/* Enter your name: Karunakar
Enter your roll number: 01
Enter your field of interest: Cybersecurity
Hey, my name is Karunakar and my roll number is 01. My field of interest is Cybersecurity.
*/