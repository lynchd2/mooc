import java.util.*;

public class Competitor implements SkiPerson {

	private String name;
	private int totalScore;
	private Map<Integer, Jump> jumps;

	public Competitor(String name) {
		this.name = name;
	}
}