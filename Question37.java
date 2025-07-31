package assignment;

import java.io.*;
import java.util.Scanner;

/*
Question 37:
Create a file called "batchmates.txt"
Write your batchmates' names into it
Then read and display the contents
*/

public class Question37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("batchmates.txt");

        // Step 1: Write names to file
        try (FileWriter writer = new FileWriter(file)) {
            System.out.print("How many batchmates? ");
            int count = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter names of your batchmates:");
            for (int i = 0; i < count; i++) {
                String name = scanner.nextLine();
                writer.write(name + "\n");
            }

            System.out.println("\n✅ Names saved successfully to batchmates.txt");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }

        // Step 2: Read and display file contents
        System.out.println("\n📄 Contents of batchmates.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("👤 " + line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}

/*

How many batchmates? 3
Enter names of your batchmates:
Akhil
Praveen
Ravi

✅ Names saved successfully to batchmates.txt

📄 Contents of batchmates.txt:
👤 Akhil
👤 Praveen
👤 Ravi
*/
