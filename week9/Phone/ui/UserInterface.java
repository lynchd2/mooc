package ui;

import java.util.Scanner;
import logic.AddressBook;

public class UserInterface {

	private Scanner userInput;

	public UserInterface() {
		this.userInput = new Scanner(System.in);
	}

	public void mainMenu(AddressBook addressBook){
		System.out.println("phone search");
		System.out.println("available operations:");
		System.out.println("1 add a number");
		System.out.println("2 search for a number");
		System.out.println("3 search for a person by phone number");
		System.out.println("4 add an address");
		System.out.println("5 search for personal information");
		System.out.println("6 delete personal information");
		System.out.println("7 filtered listing");
		System.out.println("x quit");
		System.out.print("command: ");
        String input = this.userInput.nextLine(); 
        OptionsHandler(input, addressBook);
	}

	public void OptionsHandler(String input, AddressBook addressBook) {
		if(input.equals("1")) {
			AddNumber(addressBook);
		} else if (input.equals("2")) {
			FindByName(addressBook);
		} else if (input.equals("3")) {
			FindByNumber(addressBook);
		} else if (input.equals("4")) {
			AddAddress(addressBook);
		} else if (input.equals("5")) {
			AllPersonInformation(addressBook);
		} else if (input.equals("6")) {
			DetePersonsInformation(addressBook);
		} else if (input.equals("7")) {
			KeyWordToSearch(addressBook);
		} else if (input.equals("x")) {
			System.exit(0);
		} else {
			System.out.println("That is not a command. Please try again.");
		}
		System.out.print("command:");
		String input3 = this.userInput.nextLine();
		OptionsHandler(input3, addressBook);
	}

	public void AddNumber(AddressBook addressBook) {
		System.out.print("whose number: ");
		String name = this.userInput.nextLine();
		System.out.print("number: ");
		String number = this.userInput.nextLine();
		addressBook.addNumber(name, number);
	}

	public void FindByName(AddressBook addressBook)  {
		System.out.print("whose number to search: ");
		String name = this.userInput.nextLine();
		addressBook.findPersonsNumber(name);
	}

	public void FindByNumber(AddressBook addressBook) {
		System.out.print("what number to search: ");
		String number = this.userInput.nextLine();
		addressBook.findPersonByNumber(number);
	}

	public void AllPersonInformation(AddressBook addressBook) {
		System.out.print("Whose information to get: ");
	}

	public void AddAddress(AddressBook addressBook) {
		System.out.print("Whose Address:");
		System.out.print("What street?");
		System.out.print("What's the state?");
	}

	public void DetePersonsInformation(AddressBook addressBook) {
		System.out.print("Whose infomration to delete: ");
	}

	public void KeyWordToSearch(AddressBook addressBook) {
		System.out.print("What keyword to search for?");
	}
}