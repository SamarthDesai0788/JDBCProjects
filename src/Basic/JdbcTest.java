package Basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
    static final String JDBC_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASSWORD = "Sama0788";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register the JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // Create a statement
            stmt = conn.createStatement();

            // SQL command to create a new database
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS new_database_name";
            
            // Execute the SQL command to create the database
            stmt.executeUpdate(createDatabaseSQL);

            System.out.println("Database created successfully.");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
