package Basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDBConn {
	public void insert(int empid,String name,int salary) throws ClassNotFoundException, SQLException {
		Connection con=DBconnection.getConnection();
		String iquery="insert into employee1 values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(iquery);
		ps.setInt(1,empid);
		ps.setString(2,name);
		ps.setInt(3, salary);
		int count=ps.executeUpdate();
		if(count>0) {
			System.out.println("Record has been inserted succesfully");
		}
	}
	public void display() throws ClassNotFoundException, SQLException {
		ArrayList<Employedao>alist=new ArrayList<Employedao>();
		Connection con=DBconnection.getConnection();
		String squery="select * from employee1";
		PreparedStatement ps=con.prepareStatement(squery);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			alist.add(new Employedao(rs.getInt(5),rs.getString(2),rs.getInt(3)));
		}
	for(Employedao e:alist) {
		System.out.println("Eid"+e.empid+"Ename"+e.ename+"Esalary"+e.salary);		
	}
	}
}