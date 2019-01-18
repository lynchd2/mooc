import java.util.*;

public class Competitor {

	private String name;
	private int totalScore;
	private Map<Round, Jump> jumps;

	public Competitor(String name) {
		this.name = name;
		this.jumps = new HashMap<Round, Jump>();
	}

	public void makeJump(Round round) {
		Jump jump = new Jump(round);
		this.totalScore = this.totalScore + jump.jumpScore();
		this.jumps.put(round, jump);
	}
	public int getJumpLength(Round round) {
		return this.jumps.get(round).jumpScore();
	}

	public int totalScore() {
		return this.totalScore;
	}

	public String name() {
		return this.name;
	}


	public void assignJudgeScore(int judgeScore) {
		this.totalScore = this.totalScore() + judgeScore;
	}

	// @Override
	// public int compareTo(Competitor competitor) {
	// 	if (this.totalScore() < competitor.totalScore()) {
	// 		return 1;
	// 	} else if (this.totalScre() > competitor.totalScre()) {
	// 		return -1;
	// 	} else {
	// 		return 0;
	// 	}
	// }
}