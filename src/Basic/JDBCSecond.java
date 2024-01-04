package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSecond {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Team_10", "root", "Sama0788");
		String iquery="insert into person values(14,'Rahul','Gulabarga');";
		//PreparedStatement ps=con.prepareStatement(iquery);
		//ps.setInt(1, 12);
		//ps.setString(2, "Samarth");
		//ps.setString(3, "Benglore");
		//int count=ps.executeUpdate();
	//if(count>0)
	//{
		//System.out.println(count+" Record inserted Suceessfully  ");
	//
		//String dquery="delete from person where id=14";
		//String uquery="update person set pname='SamarthDesai' where id=12";
		
		Statement stmt=con.createStatement();		
	//	int count=stmt.executeUpdate(uquery);
		//if(count>0)
		//{
			//System.out.println(count+" Record inserted Suceessfully ");
		//}
		String fetch="Select * from person";
		ResultSet rs=stmt.executeQuery(fetch);
		while (rs.next())
		{
			System.out.println("Id: "+rs.getInt(1)+"\n Name:" +rs.getString(2)+"\n city: "+rs.getString(3));
		}
	}	
	}
