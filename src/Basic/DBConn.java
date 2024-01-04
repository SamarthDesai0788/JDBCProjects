package Basic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
 private Connection connection;

 public DBConn() {
     String url = "jdbc:mysql://localhost:3306/";
     String username = "root";
     String password = "Sama0788";

     try {
         this.connection = DriverManager.getConnection(url, username, password);
     } catch (SQLException e) {
         System.out.println("Connection to database failed!");
         e.printStackTrace();
     }
 }

 public Connection getConnection() {
     return connection;
 }
}
