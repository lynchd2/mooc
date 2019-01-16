import java.util.*;


public class Judge implements SkiPerson {

	private int judgeNumber;
	private Map<Integer, Vote> votes;
	
	public Judge(int judgeNumber) {
		this.judgeNumber = judgeNumber;
	}
}