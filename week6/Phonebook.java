import java.util.*;


public class Phonebook {

	private ArrayList<Person> people = new ArrayList<Person>();


	public void add(String name, String number) {
		Person person = new Person(name, number);
		people.add(person);
	}

	public void printAll() {
		for(Person person : people) {
			System.out.println(person);
		}
	}

	public String searchNumber(String name) {
		for (Person person : people) {
			if (person.getName().contains(name)) {
				return person.getNumber();
			} else {
				return "Number not known";
			}
		}
		return "";
	}
}