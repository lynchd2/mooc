import java.util.*;


public class Judge {

	private int judgeNumber;
	private List<Vote> votes;
	
	public Judge(int judgeNumber) {
		this.judgeNumber = judgeNumber;
		this.votes = new ArrayList<Vote>();
	}

	public List<Vote> getVotes() {
		return this.votes;
	}

	public Vote getRoundVote(int i) {
		return this.votes.get(i);
	}

	public void makeJudgement(Round round, Jump jump, Competitor competitor) {
		int voteScore = (int) (Math.random() * 10 + 10);
		int roundNumber = round.roundNumber();
		Vote vote = new Vote(voteScore, roundNumber, competitor);
		jump.addVoteToJump(vote);
		this.votes.add(vote);
	}


}