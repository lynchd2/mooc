import java.lang.Math

public class Jump {

	private int jumpScore;
	private int round;

	public Jump(int roundNumber) {
		this.round = roundNumber;
		this.jumpScore = (Int) Math.random() * 61 + 10;
	}


}