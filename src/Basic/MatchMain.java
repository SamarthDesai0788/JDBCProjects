package Basic;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class MatchMain {
	
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("1. Insert Match Information");
		System.out.println("2. View All Matches Information");
		System.out.println("3. View Upcoming Matches ");
		System.out.println("4. Update Match Information");
		System.out.println("5. Delete Match Details");
		int choice=s.nextInt();
		MatchBo mb=new MatchBo();
		switch(choice) {
		case 1:
			//Insert Operation
			System.out.println("Insert Match Information");
			
			//read all the value from keyboard
			System.out.println("Enter Match id ");
			int mid=s.nextInt();
			System.out.println("Enter the Team Name 1");
			String team1=s.next();
			System.out.println("Enter the Team Name 2");
			String team2=s.next();
			System.out.println("Enter the Match Date(YYYY-MM-DD)");
			String date=s.next();
			LocalDate ld=LocalDate.parse(date);
			
			Match m1=new Match(mid,team1,team2,ld);
			
			boolean b=mb.insertMatch(m1);
			if(b==false) {
				System.out.println("Match Inserted Successfully");
			}
			
			break;
		case 2:
			//View Match Information
			System.out.println("All Match Information");
			List<Match>li=mb.getAllMatches();
			for(Match m2:li) {
				System.out.println(m2);
			}
			break;
		case 3:
			//View Upcoming Matches
			
			break;
		case 4:
			//Update Match Information
			
			System.out.println("Enter the Match Id");
			int mid1=s.nextInt();
			Match m3=mb.getMatchById(mid1);
			System.out.println(m3);
			
			System.out.println("D you want to update team1 (Y/N)"+m3.getTeam1());
			String ch1=s.next();
			if(ch1.equalsIgnoreCase("y")) {
				String team1u=s.next();
				m3.setTeam1(team1u);
			}
			else {
				
			}
			System.out.println("D you want to update team2 (Y/N)"+m3.getTeam2());
			String ch2=s.next();
			if(ch2.equalsIgnoreCase("y")) {
				String team2u=s.next();
				m3.setTeam2(team2u);
			}
			System.out.println(m3);
			
			break;
		case 5:
			//Delete Match Details
			break;
		default:
			System.out.println("Please Choose Correct Option");
		}
		
	}

}
