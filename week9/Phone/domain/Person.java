package domain;

import java.util.Set;
import java.util.HashSet;
import domain.Address;
import domain.PhoneNumber;
import domain.Information;

public class Person {

	private Set<Information> addresses;
	private Set<Information> phoneNumbers;
	private String name;

	public Person(String name){
		this.addresses = new HashSet<Information>();
		this.phoneNumbers = new HashSet<Information>();
		this.name = name;
	}

	public void addPhoneNumber(Information number) {
		this.phoneNumbers.add(number);
	}

	public String getName() {
		return this.name;
	}

	public Set<Information> getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public Set<Information> getAddresses() {
		return this.addresses;
	}

	public void addAddress(String street, String state) {
		Information address = new Address(street, state);
		this.addresses.add(address);
	}
}