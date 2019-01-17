import java.util.*;


public class Judge {

	private int judgeNumber;
	private Map<Round, Vote> votes;
	
	public Judge(int judgeNumber) {
		this.judgeNumber = judgeNumber;
	}

	public void makeJudgement(Round round, Competitor competitor) {
		int voteScore = (int) Math.random() * 10 + 10;
		int roundNumber = round.roundNumber();
		Vote vote = new Vote(voteScore, roundNumber, competitor);
		this.votes.put(round, vote);
	}
}