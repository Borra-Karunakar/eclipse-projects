package assignment;

import java.util.Scanner;

/*
Question 24:
Five bikers compete. Qualify if speed > average.
Input: 5 speeds. Output: speeds of qualifying racers.


*/

public class Question24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        System.out.println("Enter speed of 5 bikers:");

        for (int i = 0; i < 5; i++) {
            speeds[i] = scanner.nextDouble();
            sum += speeds[i];
        }

        double average = sum / 5;
        System.out.println("Average Speed: " + average);
        System.out.println("Qualifying speeds:");

        for (double speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
            }
        }

        scanner.close();
    }
}

/*
Input:
50 60 55 70 65

Output:
Average Speed: 60.0
Qualifying speeds:
70.0
65.0
*/
