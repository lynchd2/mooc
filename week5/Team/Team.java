import java.util.*;

public class Team {
	private String name;
	private ArrayList<Player> teamPlayers = new ArrayList<Player>();
	private int maxSize;

	public Team(String teamName) {
		this.name = teamName;
		this.maxSize = 16;
	}

	public String getName() {
		return this.name;
	}

	public void addPlayer(Player player) {
		if(this.size() < this.maxSize) {
			teamPlayers.add(player);
		}
	}

	public void printPlayers() {
		for(Player player : this.teamPlayers) {
			System.out.println(player);
		}
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int size() {
		int currentSize = 0;
		for(Player player : this.teamPlayers) {
			currentSize++;
		}
		return currentSize;
	}

	public int goals() {
		int allGoals = 0;
		for(Player player : this.teamPlayers) {
			allGoals = allGoals + player.goals();
		}
		return allGoals;
	}
}