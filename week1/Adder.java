import java.util.Scanner;

public class Adder {
	public static void main(String[] args) {
	Scanner commandLine = new Scanner(System.in);

	System.out.print("Type a number: ");

	int firstNumber = Integer.parseInt(commandLine.nextLine());

	System.out.print("Type another number: ");

	int secondNumber = Integer.parseInt(commandLine.nextLine());
	int sum = firstNumber + secondNumber;

	System.out.println("Sum of the numbers:" + sum);
	
	}
}