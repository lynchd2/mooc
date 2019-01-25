package logic;

import java.util.Set;
import java.util.HashSet;
import domain.Person;
import domain.PhoneNumber;
import domain.Information;

public class AddressBook {

	private Set<Person> people;

	public AddressBook() {
		this.people = new HashSet<Person>();
	}

	public void addNumber(String name, String number) {
		Person person = new Person(name);
		PhoneNumber phoneNumber = new PhoneNumber(number);
		person.addPhoneNumber(phoneNumber);
		this.people.add(person);
	}

	public void findPersonsNumber(String name) {
		for(Person person : people) {
			if(person.getName().equals(name)) {
				for(Information phoneNumber : person.getPhoneNumbers()) {
					System.out.println(phoneNumber.getInformation());
				}
			} 
		}
	}

	public void findPersonByNumber(String number) {
		for(Person person : people) {
			for (Information phoneNumber : person.getPhoneNumbers()) {
				if(phoneNumber.getInformation().equals(number)) {
					System.out.println(person.getName());
				}
			} 
		}	
	}
}