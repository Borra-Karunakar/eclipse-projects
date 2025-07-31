/*15.Write a program to construct an array with 10 elements and to find the number of    
occurrences of each element in the Array. */
package assignment;

import java.util.HashMap;
import java.util.Map;

public class Question15 {
    public static void main(String[] args) {
        // Define an array with 10 elements (some repeating)
        int[] arr = {5, 3, 5, 2, 3, 8, 5, 2, 9, 3};

        // Create a HashMap to store element counts
        Map<Integer, Integer> countMap = new HashMap<>();

        // Loop through array and count occurrences
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);  // increment count
            } else {
                countMap.put(num, 1);  // first time
            }
        }

        // Print the result
        System.out.println("Occurrences of each element:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
/* Occurrences of each element:
2 occurs 2 times
3 occurs 3 times
5 occurs 3 times
8 occurs 1 time
9 occurs 1 time
*/