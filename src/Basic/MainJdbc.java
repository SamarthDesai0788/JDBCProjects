package Basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class MainJdbc {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Match id ");
		int mid=sc.nextInt();
		System.out.println("Enter the Team Name 1");
		String team1=sc.next();
		System.out.println("Enter the Team Name 2");
		String team2=sc.next();
		System.out.println("Enter the Match Date(YYYY-MM-DD)");
		String date=sc.next();
		LocalDate ld=LocalDate.parse(date);
		//step 1 load the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step2
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/match1","root","Sama0788");
	//step 3
	Statement s=con.createStatement();
	//insert into MATCH 1 values(id,team,team2 date)
	boolean b=s.execute("insert into match2 values("+mid+",'"+team1+"','"+team2+"','"+ld+"')");
	if(b==false) {
		System.out.println("Value Inserted Successfully...");
	}else {
		System.out.println("Some Error Occured..");
	}
	System.out.println(b);
	}
}

