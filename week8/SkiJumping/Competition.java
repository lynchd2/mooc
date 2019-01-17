import java.util.*;


public class Competition {
	private List<SkiPerson> judges;
	private List<SkiPerson> competitors;
	private static int round = 1;

	public Competition() {
		this.competitors = new ArrayList<SkiPerson>();
		this.judges = new ArrayList<SkiPerson>();
	}

	public void CreateCompetitors(ArrayList<String> competitorNames) {
		if(competitorNames.size() > 0 && !competitorNames.get(0).equals("")) {
			for (String name : competitorNames) {
				if(!name.equals("")){
					SkiPerson competitor = new Competitor(name);
					this.competitors.add(competitor);
				}
			}
			return;
		}
		
	}

	public void CreateJudges() {
		for(int i = 1; i < 6;i++) {
			SkiPerson judge = new Judge(i);
			this.judges.add(judge);
		}
	}


	public void startNewRound() {
		for(int i = 0; i < competitors.size();i++) {
			competitors.get(i).makeJump(round);
			round++;
		}
	} 
}