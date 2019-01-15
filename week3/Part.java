import java.util.Scanner;

public class Part {
	
	public static void main(String[] args) {
		//firstPart();
		endPart();
	}

	public static void firstPart() {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word:");
		String firstWord = input.nextLine();
		int lengthFirstWord = lengthOfWord(firstWord, input);
		String cutFirstWord = cutFirstWord(firstWord, lengthFirstWord);
		System.out.println("Result: " + cutFirstWord);
	}


	public static void endPart() {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word:");
		String firstWord = input.nextLine();
		int lengthFirstWord = lengthOfWord(firstWord, input);
		String endFirstWord = endFirstWord(firstWord, lengthFirstWord);
		System.out.println("Result: " + endFirstWord);
	}

	public static int lengthOfWord(String word, Scanner input) {
		System.out.print("Length of the first part: ");
		int lenOfWord = Integer.parseInt(input.nextLine());
		return lenOfWord;
	}

	public static String cutFirstWord(String word, int substringNumber) {
		return word.substring(0,substringNumber);
	}

	public static String endFirstWord(String word, int substringNumber) {
		return word.substring(substringNumber + 1);
	}

}