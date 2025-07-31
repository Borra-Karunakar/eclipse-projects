package assignment;

import java.io.*;

/*
Question 43:
Read contents of a text file using BufferedReader and try-with-resources.
Handle exceptions gracefully.
*/

public class Question43 {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // you can change this to your file

        System.out.println("Reading file: " + fileName);

        // Try-with-resources automatically closes BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n📄 File Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println("➤ " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }
}
