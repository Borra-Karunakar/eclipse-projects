package assignment;

/*
Question 42:
Demonstrate rethrowing an exception.
someMethod2 throws → someMethod catches and rethrows → main catches and prints stack trace.
*/

public class Question42 {

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown from someMethod2()");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught in someMethod(), rethrowing...");
            throw e;  // rethrow the same exception
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught in main():");
            e.printStackTrace();  // print full stack trace
        }
    }
}
