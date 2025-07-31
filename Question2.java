
/*2.Now, solve the above question using assignment operators (eg. +=, -=, *=).
*/

package assignment;

public class Question2 {
    public static void main(String[] args) {
        int number = 2345;
        number += 8;    // Adds 8 → number becomes 2353
        number /= 3;    // Divides by 3 → becomes 784
        number %= 5;    // Modulus with 5 → becomes 4
        number *= 5;    // Multiply by 5 → becomes 20

        System.out.println("Final Result using assignment operators: " + number);
    }
}

/*
Final Result using assignment operators: 20
*/