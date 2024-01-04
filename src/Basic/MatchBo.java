package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MatchBo {
	
		public boolean insertMatch(Match m)throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/match1","root","Sama0788");
			//step 3
			Statement s=con.createStatement();
			//insert into MATCH 1 values(id,team,team2 date)
			boolean b=s.execute("insert into match2 values("+m.getMatchId()+",'"+m.getTeam1()+"','"+m.getTeam2()+"','"+m.getMatchDate()+"')");
			
			return b;
		}
			public List<Match>getAllMatches()throws Exception {
				List<Match>li=new ArrayList<Match>();
				//Step 1
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/match1","root","Sama0788");
				//Step 3
				PreparedStatement ps=con.prepareStatement("select * from match2");
				//Step 3.a
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					li.add(new Match(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4).toLocalDate()));
				}
				
				return li;
	}
			public Match getMatchById(int id) throws Exception{
				Match m=new Match();
				//select * from match2 where matchid=?
				Class.forName("com.mysql.cj.jdbc.Driver");
				//step2
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/match1","root","Sama0788");
				
				PreparedStatement ps=con.prepareStatement("select * from match2 where id=?");
				//Step 3.a
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					m=new Match(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4).toLocalDate());
				}
				return m;
			}
			public boolean updateMatch(Match m)throws Exception {
				
				//update set team1=m.getTeam1() team2=m.getTeam2() matchdate=m.getMatchDate() where matchid=m.getMatchId()
				Class.forName("com.mysql.cj.jdbc.Driver");
				//step2
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/match1","root","Sama0788");
				
				PreparedStatement ps=con.prepareStatement("update set team1=? team2=? where id=?");
				ps.setString(1,m.getTeam1());
				return false;
				
			}
			public List<Match> getAvailableMatches(){
				//your logic
				List<Match> li=new ArrayList<Match>();
				//your logic
				return li;
			}
			public boolean deleteMatchInformation(int id) {
				return false;
			} 
}