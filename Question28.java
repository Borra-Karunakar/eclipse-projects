package assignment;

/*
Question 28:
Use Lambda expressions to:
1. Check if number is odd
2. Check if number is prime
3. Check if number is palindrome
*/

interface PerformOperation {
    boolean check(int num);
}

public class Question28 {

    // Lambda to check if number is odd
    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Lambda to check if number is prime
    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    // Lambda to check if number is palindrome
    public static PerformOperation isPalindrome() {
        return n -> {
            int original = n, reversed = 0;
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            return original == reversed;
        };
    }

    public static void main(String[] args) {
        int number = 121;

        PerformOperation oddOp = isOdd();
        PerformOperation primeOp = isPrime();
        PerformOperation palindromeOp = isPalindrome();

        System.out.println(number + " is odd? " + oddOp.check(number));
        System.out.println(number + " is prime? " + primeOp.check(number));
        System.out.println(number + " is palindrome? " + palindromeOp.check(number));
    }
}

/*
 Output for number = 121:
121 is odd? true
121 is prime? false
121 is palindrome? true
*/
