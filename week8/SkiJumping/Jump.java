import java.lang.Math;
import java.util.*;
public class Jump {

	private int jumpScore;
	private Round round;
	public List<Vote> jumpVotes;

	public Jump(Round round) {
		this.round = round;
		this.jumpScore = (int)(Math.random() * 61 + 10);
		this.jumpVotes = new ArrayList<Vote>();
	}

	public int jumpScore() {
		return this.jumpScore;
	}

	public void addVoteToJump(Vote vote) {
		this.jumpVotes.add(vote);
	}


}