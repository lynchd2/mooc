package domain;

public class Address implements Information {

	private String address;

	public Address(String street, String state){
		this.address = combineAddress(street, state);
	}

	public String getInformation() {
		return this.address;
	}

	public void setInformation(String information) {
		this.address = information;
	}

	public String combineAddress(String street, String state) {
		return street + " " + state;
	}
	

}

