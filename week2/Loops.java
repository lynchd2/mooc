import java.util.Scanner;

public class Loops {


	public static void main(String[] args) {
		Scanner readinput = new Scanner(System.in);
		System.out.println("Type Numbers");
		int numberTyped = Integer.parseInt(readinput.nextLine());
		int sumOfAllTyped = 0;
		int totalNumbersTyped = 0;
		int evenNumbers = 0;
		int oddNumbers = 0;
		if (numberTyped > -1) {
			while(numberTyped > -1) {
				if (numberTyped % 2 == 0 || numberTyped == 0) {
					evenNumbers ++;
				} else {
					oddNumbers ++;
				}
				sumOfAllTyped = sumOfAllTyped + numberTyped;
				totalNumbersTyped ++;
				numberTyped = Integer.parseInt(readinput.nextLine());
				if (numberTyped > -1) {
					totalNumbersTyped ++;
					sumOfAllTyped = sumOfAllTyped + numberTyped;
					System.out.println("Current sum is: " + sumOfAllTyped);
				}
			}
		}
		double average;
		average = sumOfAllTyped / Double.valueOf(totalNumbersTyped);
		System.out.println("See you later! Your total was: " + sumOfAllTyped + " and the total numbers added were " + totalNumbersTyped + ". You're average was " + average);
		System.out.println("Even Numbers: " + evenNumbers);
		System.out.println("Odd Numbers: " + oddNumbers);
	}
}