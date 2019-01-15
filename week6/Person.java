import java.util.*;


public class Person {
	private String name;
	private String phoneNumber;


	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.phoneNumber;
	}

	public void changeNumber(String newNumber) {
		this.phoneNumber = newNumber;
	}

	public String toString() {
		return this.name + ", number: " + this.phoneNumber;
	}


	public static void main(String[] args) {
	    Phonebook phonebook = new Phonebook();
	    phonebook.add("Pekka Mikkola", "040-123123");
	    phonebook.add("Edsger Dijkstra", "045-456123");
	    phonebook.add("Donald Knuth", "050-222333");

	    String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println( number );

	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println( number );
	}
}