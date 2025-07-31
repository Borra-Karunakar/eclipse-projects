package assignment;

/*
Question 32:
Demonstrate multiple catch blocks for:
NegativeArraySizeException,
ArrayIndexOutOfBoundsException,
StringIndexOutOfBoundsException,
IndexOutOfBoundsException,
NullPointerException,
ArithmeticException.
Print the stack trace for each.
*/

public class Question32 {
    public static void main(String[] args) {

        // 1. NegativeArraySizeException
        try {
            System.out.println("Testing NegativeArraySizeException...");
            int[] arr = new int[-3];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught: NegativeArraySizeException");
            e.printStackTrace();
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            System.out.println("\nTesting ArrayIndexOutOfBoundsException...");
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }

        // 3. StringIndexOutOfBoundsException
        try {
            System.out.println("\nTesting StringIndexOutOfBoundsException...");
            String s = "Java";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: StringIndexOutOfBoundsException");
            e.printStackTrace();
        }

        // 4. IndexOutOfBoundsException
        try {
            System.out.println("\nTesting IndexOutOfBoundsException...");
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            list.add("One");
            list.add("Two");
            System.out.println(list.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught: IndexOutOfBoundsException");
            e.printStackTrace();
        }

        // 5. NullPointerException
        try {
            System.out.println("\nTesting NullPointerException...");
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught: NullPointerException");
            e.printStackTrace();
        }

        // 6. ArithmeticException
        try {
            System.out.println("\nTesting ArithmeticException...");
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: ArithmeticException");
            e.printStackTrace();
        }
    }
}
