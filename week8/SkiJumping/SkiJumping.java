import java.util.*;

public class SkiJumping {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserInterface uf = new UserInterface();
		System.out.println("Kumpula ski jumping week");
			Competition competition = new Competition();
			ArrayList<String> competitorNames = UserInterface.gatherCompetitorNames(scan);
			competition.CreateCompetitors(competitorNames);
			competition.CreateJudges();
			UserInterface.StartJumps(scan, competition);

	}


}