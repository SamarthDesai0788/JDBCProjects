package Basic;

import java.time.LocalDate;;

public class Match {
	
	private int matchId;
	private String team1;
	private String team2;
	private LocalDate matchDate;
	
	public Match() {
		super();
	}
	public Match(int matchId, String team1, String team2, LocalDate matchDate) {
		super();
		this.matchId = matchId;
		this.team1 = team1;
		this.team2 = team2;
		this.matchDate = matchDate;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public LocalDate getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}
	@Override
	public String toString() {
		return "Match matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", matchDate=" + matchDate;
	}

	
	
}