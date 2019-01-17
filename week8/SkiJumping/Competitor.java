import java.util.*;

public class Competitor {

	private String name;
	private int totalScore;
	private Map<Round, Jump> jumps;

	public Competitor(String name) {
		this.name = name;
	}

	public void makeJump(Round round) {
		Jump jump = new Jump(round);
		this.jumps.put(round, jump);
	}

	public int totalScore() {
		return this.totalScore;
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