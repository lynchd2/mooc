package domain;

public class Address implements Information {

	private String address;

	public Address(String address){
		this.address = address;
	}

	public String getInformation() {
		return this.address;
	}

	public void setInformation(String information) {
		this.address = information;
	}

	public void combineAddress(String address, String street) {
		setInformation(street + " " + address);
	}
	

}

