import java.util.Scanner;

public class ManyPrints {
	public static void main(String args[]) {
		System.out.println("How many?");
		Scanner read = new Scanner(System.in);
		int userInput = Integer.parseInt(read.nextLine());
		for(int i = 0; i < userInput;i++) {
			printText();
		}
	}

	public static void printText() {
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}


}