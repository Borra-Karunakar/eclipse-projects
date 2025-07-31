package assignment;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Question 26:
Given an integer array, remove duplicates and print sum of even numbers.


*/

public class Question26 {
    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Step 1: Remove duplicates using LinkedHashSet
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : input) {
            uniqueSet.add(num);
        }

        // Step 2: Calculate sum of even numbers
        int evenSum = 0;
        for (int num : uniqueSet) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        // Step 3: Print results
        System.out.println("Unique elements: " + uniqueSet);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}

/*
Output:
Unique elements: [2, 3, 54, 1, 6, 7]
Sum of even numbers: 62
*/
