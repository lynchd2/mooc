import java.util.Scanner;

public class SumThree {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int read;

		System.out.print("Type the first number: ");
		sum = sum + Integer.parseInt(reader.nextLine());
		System.out.print("Type the seconds number:");
		sum = sum + Integer.parseInt(reader.nextLine());
		System.out.print("Type the third number:");
		sum = sum + Integer.parseInt(reader.nextLine());
		System.out.println("");
		System.out.println("Sum: " + sum);	
	}
}


