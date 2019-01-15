import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner passwordInput = new Scanner(System.in);
		System.out.print("Type the password: ");
		String password = passwordInput.nextLine();
		while (!password.equals("carrot")) {
			System.out.println(password);
			System.out.print("Wrong. Type the password: ");
			password = passwordInput.nextLine();
		}
		if (password.equals("carrot")) {
			System.out.println("Correct! This is the secret. Was it worth it?")
		}
	}
}