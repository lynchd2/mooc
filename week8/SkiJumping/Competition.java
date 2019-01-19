import java.util.*;


public class Competition {
	private List<Judge> judges;
	private List<Competitor> competitors;
	private List<Round> rounds;

	public Competition() {
		this.competitors = new ArrayList<Competitor>();
		this.judges = new ArrayList<Judge>();
		this.rounds = new ArrayList<Round>();
	}

	public List<Judge> judges() {
		return this.judges;
	}

	public List<Competitor> competitors() {
		return this.competitors;
	}

	public List<Round> rounds() {
		return this.rounds;
	}

	public Round getThisRound() {
		return this.rounds().get(this.rounds().size() - 1);
	}

	public void CreateCompetitors(ArrayList<String> competitorNames) {
		if(competitorNames.size() > 0 && !competitorNames.get(0).equals("")) {
			for (String name : competitorNames) {
				if(!name.equals("")){
					Competitor competitor = new Competitor(name);
					this.competitors.add(competitor);
				}
			}
		}
		return;
		
	}

	public void CreateJudges() {
		for(int i = 1; i < 6;i++) {
			Judge judge = new Judge(i);
			this.judges.add(judge);
		}
	} 

	public int getRoundNumber() {
		int maxRound = 1;
		if (this.rounds.size() == 0 || this.rounds.size() == 1) {
			return 1;
		} else { 
			return this.rounds.size();
		}

	} 

	public ArrayList<Integer> gatherJudgeVotes() {
		ArrayList<Integer> judgesVotes = new ArrayList<Integer>();
		for(int j = 0; j < this.judges.size();j++) {
			judgesVotes.add(this.judges.get(j).getRoundVote(this.getRoundNumber() - 1).voteScore());
		}
		Collections.sort(judgesVotes);
		return judgesVotes;
	}


	public int gatherBestVotes(ArrayList<Integer> judgesVotes) {
		int total = 0;
		total = judgesVotes.get(2) + judgesVotes.get(3) + judgesVotes.get(4);
		return total;
	}


	public void startNewRound() {
		Round round = new Round(this.getRoundNumber());
		this.rounds.add(round);
		for(int i = 0; i < this.competitors.size();i++) {
			this.competitors.get(i).makeJump(round);
			for(int j = 0; j < this.judges.size();j++) {
				this.judges.get(j).makeJudgement(round, this.competitors.get(i).getJump(round) ,this.competitors.get(i));
			}
			this.competitors.get(i).assignJudgeScore(gatherBestVotes(gatherJudgeVotes()));
		}
	}

}