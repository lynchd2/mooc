import java.util.*;


public class Competition {
	private List<Judge> judges;
	private List<Competitor> competitors;
	private List<Round> rounds;

	public Competition() {
		this.competitors = new ArrayList<Competitor>();
		this.judges = new ArrayList<Judge>();
	}

	public List<Judge> judges() {
		return this.judges;
	}

	public List<Competitor> competitors() {
		return this.competitors;
	}

	public void CreateCompetitors(ArrayList<String> competitorNames) {
		if(competitorNames.size() > 0 && !competitorNames.get(0).equals("")) {
			for (String name : competitorNames) {
				if(!name.equals("")){
					Competitor competitor = new Competitor(name);
					this.competitors.add(competitor);
				}
			}
			return;
		}
		
	}

	public void CreateJudges() {
		for(int i = 1; i < 6;i++) {
			Judge judge = new Judge(i);
			this.judges.add(judge);
		}
	} 

	public int getRoundNumber() {
		int maxRound = 1;
		if (this.rounds.size() == 0) {
			return 1;
		} else {
			for(Round round : this.rounds) {
				if (round.roundNumber() > maxRound) {
					maxRound = round.roundNumber();
				}
			}
		}
		return maxRound;

	} 


	public void startNewRound() {
		Round round = new Round(this.getRoundNumber());
		this.rounds.add(round);
		for(int i = 0; i < this.competitors.size();i++) {
			this.competitors.get(i).makeJump(round);
			for(int j = 0; j < this.judges.size();j++) {
				this.judges.get(j).makeJudgement(round, this.competitors.get(i));
			}
		}
	}

}