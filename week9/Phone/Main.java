import domain.Address;
import domain.Information;
import domain.Person;
import domain.PhoneNumber;
import logic.AddressBook;
import ui.UserInterface;

public class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		AddressBook addressBook = new AddressBook();
		ui.mainMenu(addressBook);
	}
}