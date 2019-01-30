package people;

import people.Address;
import people.Information;

public class Person {

	private String name;
	private String address;

	public Person(String name, String address){
		this.address = address;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void addAddress(String street, String state) {
		this.address = street + state;
	}

	public String toString() {
		return this.name + "\n\r\t" + this.address; 
	}
}