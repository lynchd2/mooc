import java.lang.Math;

public class Jump {

	private int jumpScore;
	private Round round;

	public Jump(Round round) {
		this.round = round;
		this.jumpScore = (int) Math.random() * 61 + 10;
	}


}