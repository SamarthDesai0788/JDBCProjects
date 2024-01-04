package Basic;
import java.sql.*;
public class JDBCFirst {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Team_10", "root", "Sama0788");
	Statement stmt=con.createStatement();
	String query="Create table Person(id int,pname varchar(20),pcity varchar(20));";
	boolean check=stmt.execute(query);
	if(check==false) 
	{
		System.out.println("Table is created");
	}
	else
	{
		System.out.println("not created");
	}
	con.close();
	
	}

}
