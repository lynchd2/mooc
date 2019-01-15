

public class Player {

	private String name;
	private int goals;

	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, int goalAmount) {
		this.name = name;
		this.goals = goalAmount;
	}

	public String getName() {
		return this.name;
	}

	public int goals() {
		return this.goals;
	}

	public String toString() {
		return this.name + ", " + this.goals;
	}
}