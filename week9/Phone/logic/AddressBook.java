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
		for(Person person : this.people) {
			if(person.getName().equals(name)) {
				PhoneNumber phoneNumber = new PhoneNumber(number);
				person.addPhoneNumber(phoneNumber);
				return;
			}
		}
		Person personObject = new Person(name);
		PhoneNumber phoneNumber = new PhoneNumber(number);
		personObject.addPhoneNumber(phoneNumber);
		this.people.add(personObject);
		return;
	}

	public void findPersonsNumber(String name) {
		for(Person person : this.people) {
			if(person.getName().equals(name)) {
				if(person.getPhoneNumbers().size() == 0) {
					System.out.println("phonenumbers unknown");
				} else {
					System.out.println("Phone Numbers: ");
					for(Information phoneNumber : person.getPhoneNumbers()) {
						System.out.println(phoneNumber.getInformation());
					}
				}
			}
		}
	}

	public void findPersonByNumber(String number) {
		for(Person person : this.people) {
			for (Information phoneNumber : person.getPhoneNumbers()) {
				if(phoneNumber.getInformation().equals(number)) {
					System.out.println(person.getName());
				}
			} 
		}	
	}

	public void findPersonsAddress(String name) {
		for(Person person : this.people) {
			if(person.getName().equals(name)) {
				if(person.getAddresses().size() == 0) {
					System.out.println("address unknown");
				} else {
					System.out.println("Addresses: ");
					for(Information address : person.getAddresses()) {
						System.out.println(address.getInformation());
					}
				}
			}
		}
	}

	public void allPersonalInformation(String name) {
		for(Person person : this.people) {
			if(person.getName().equals(name)) {
				findPersonsAddress(person.getName());
				findPersonsNumber(person.getName());
				return;
			}
		}
		System.out.println("Information not found");
	}

	public void addAddress(String name, String street, String state) {
		for(Person person : this.people) {
			if(person.getName().equals(name)) {
				person.addAddress(street, state);
				return;
			}
		}
		Person personObject = new Person(name);
		personObject.addAddress(street, state);
		this.people.add(personObject);
		return;
	}

	public void deletePersonalInformatiom(String name) {
		for(Person person : this.people) {
			if(person.getName().equals(name)) {
				people.remove(person);
				return;
			}
		}
		System.out.println("Person not found");
	}

	public void keyWordToSearch(String keyWord) {
		for(Person person : this.people) {
			if(person.getName().contains(keyWord)) {
				System.out.println(person.getName());
				findPersonsAddress(person.getName());
				findPersonsNumber(person.getName());
			}
		}
		for(Person person : this.people) {
			for(Information address : person.getAddresses()) {
				if(address.getInformation().contains(keyWord)) {
				System.out.println(person.getName());
				findPersonsAddress(person.getName());
				findPersonsNumber(person.getName());
				}
			}
		}
		return;
	}
}