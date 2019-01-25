package domain;

public class PhoneNumber implements Information {

	private String phoneNumber;

	public PhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getInformation() {
		return this.phoneNumber;
	}

	public void setInformation(String information) {
		this.phoneNumber = information;
	}


}

