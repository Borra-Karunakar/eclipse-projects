/* 10. Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and 
no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining. 
The total no of eggs can be got as input through command line. The program should display
how many gross, how many dozen, and how many left over eggs the user has.

Solution Guidance (if applicable): For example, if the input is 1342 eggs, then the program should respond with 
        Your number of eggs is 9 gross, 3 dozen, and 10
*/
package assignment;

public class Question10 {
    public static void main(String[] args) {
        // Check if user provided input
        if (args.length == 0) {
            System.out.println("Please provide the total number of eggs as a command-line argument.");
            return;
        }

        // Convert string input to integer
        int totalEggs = Integer.parseInt(args[0]);

        // Calculate gross (1 gross = 144 eggs)
        int gross = totalEggs / 144;
        int remainingAfterGross = totalEggs % 144;

        // Calculate dozen (1 dozen = 12 eggs)
        int dozen = remainingAfterGross / 12;
        int leftover = remainingAfterGross % 12;

        // Output result
        System.out.println("Your number of eggs is: " + gross + " gross, " + dozen + " dozen, and " + leftover + " eggs.");
    }
}
/* Your number of eggs is: 9 gross, 3 dozen, and 10 eggs.
*/