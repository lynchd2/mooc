import java.util.*;

public class UserInterface {

	public UserInterface() {


	}

	public static ArrayList<String> gatherCompetitorNames(Scanner scan){
		System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
		System.out.print("Participant name:");
		ArrayList<String> competitorNames = new ArrayList<String>();
		String competitorName = scan.nextLine();
		while(!competitorName.equals("")) {
			competitorNames.add(competitorName);
			System.out.print("Participant name:");
			competitorName = scan.nextLine();
		}
		System.out.println("");
		System.out.println("The Tournament Begins!");
		return competitorNames;
	}

	public static void StartJumps(Scanner scan, Competition competition) {
		System.out.println("Write \"jump\" to jump; otherwise you quit:");
		String start = scan.nextLine();
		while(start.equals("jump")) {
			createRound(competition);
			start = scan.nextLine();
		}
		System.exit(1);
	}

	public static void createRound(Competition competition) {
		System.out.println("Round " + competition.getRoundNumber());
		System.out.println("Jumping Order:");
		for(int i = 1; i < competition.competitors().size() + 1;i ++) {
			System.out.println(i + ". " + competition.competitors().get(i - 1) + competition.competitors().get(i - 1).totalScore());
			System.out.println("judge votes: ");
		}
	}
}