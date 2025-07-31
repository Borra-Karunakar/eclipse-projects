package assignment;

import java.sql.*;

public class StudentFetcher {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Karunakarks17$";

        try {
            // Load MySQL JDBC driver (Not strictly needed in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to MySQL database.");

            // Create statement & execute query
            String query = "SELECT * FROM Student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Display results
            System.out.println("\n📄 Student Records:");
            System.out.printf("%-5s %-10s %-5s %-10s %-6s\n", "ID", "Name", "Age", "Course", "Marks");
            System.out.println("-------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.printf("%-5d %-10s %-5d %-10s %-6.2f\n", id, name, age, course, marks);
            }

            // Cleanup
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ SQL Error.");
            e.printStackTrace();
        }
    }
}
