import java.util.*;

public class Competitor implements SkiPerson {

	private String name;
	private int totalScore;
	private Map<Round, Jump> jumps;

	public Competitor(String name) {
		this.name = name;
	}
}