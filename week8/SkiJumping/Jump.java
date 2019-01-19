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

	public List<Vote> jumpVotes() {
		return this.jumpVotes;
	}

	public List<Integer> translatedJumpVotes() {
		List<Integer> translatedVotes = new ArrayList<Integer>();
		for(Vote vote : this.jumpVotes) {
			translatedVotes.add(vote.voteScore());
		}
		return translatedVotes;
	}


}