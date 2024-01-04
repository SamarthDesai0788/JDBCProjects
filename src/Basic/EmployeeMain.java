package Basic;


public class EmployeeMain {
 public static void main(String[] args) {
    
     DBConn dbConn = new DBConn();

     if (dbConn.getConnection() != null) {
         System.out.println("Connection to database successful!");
         
     }
 }
}
