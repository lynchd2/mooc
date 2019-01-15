import java.util.*;

public class PromissoryNote {
	private String debtOwner;
	private double value;

	private HashMap<String, Double> PromissoryNotes = new HashMap<String, Double>();

	public PromissoryNote() {

	}

	public void setLoan(String toWhom, double value) {
		PromissoryNotes.put(toWhom, value);
	}

	public double howMuchIsTheDebt(String whose) {
		if(PromissoryNotes.get(whose) != null) {
			return PromissoryNotes.get(whose);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		PromissoryNote mattisNote = new PromissoryNote();
		mattisNote.setLoan("Arto", 51.5);
		mattisNote.setLoan("Mikael", 30);

		System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
		System.out.println(mattisNote.howMuchIsTheDebt("Joel"));
	}

}