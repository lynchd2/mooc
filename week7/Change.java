public class Change {

	private char fromCharcter;
	private char toCharacter;
	
	public Change(char fromCharcter, char toCharacter) {
		this.fromCharcter = fromCharcter;
		this.toCharacter = toCharacter;
	}

	public String change(String characterString) {
		return characterString.replace(this.fromCharcter, this.toCharacter);
	}

	public static void main(String[] args) {
	  String word = "carrot";
	  Change change1 = new Change('a', 'b');
	  change1.change(word);
	  System.out.println(word);

		String five = "five";
		String six = "six";

		five = six; // the variable 'five' now holds the value 6 - the value that was in the variable 'six'.
		six = "64"; // the variable 'six' now holds the value 64
		System.out.println(five);
		// the variable 'five' still holds the value 6
	}
}