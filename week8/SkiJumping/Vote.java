public class Vote {

	
	private int voteScore;
	private int voteRound;
	private Competitor voteForCompetitor;

	public Vote(int voteScore, int voteRound, Competitor competitor) {
		this.voteScore = voteScore;
		this.voteRound = voteRound;
		this.voteForCompetitor = competitor;
	}

	public int voteScore() {
		return this.voteScore;
	}

	public int voteRound() {
		return this.voteScore;
	}

	public Competitor voteForCompetitor() {
		return this.voteForCompetitor;
	}
}