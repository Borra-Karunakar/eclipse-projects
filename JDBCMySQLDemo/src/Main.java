import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // JDBC URL format: jdbc:mysql://host:port/database
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String username = "root";                        
        String password = "Karunakarks17$";                

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to the database successfully!");

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed.");
            e.printStackTrace();
        }
    }
}
