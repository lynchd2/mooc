import java.util.*;

public class VehicleRegister {

	private HashMap<RegistrationPlate, String> vehicleRegistrations;

	public VehicleRegister() {
		this.vehicleRegistrations = new HashMap<RegistrationPlate, String>();
	}

	public boolean add(RegistrationPlate plate, String owner) {	
		this.vehicleRegistrations.put(plate, owner);
		return true;
	}

	public String get(RegistrationPlate plate){
		return this.vehicleRegistrations.get(plate);
	}

	public boolean delete(RegistrationPlate plate) {
		if(this.vehicleRegistrations.get(plate) != null) {
			this.vehicleRegistrations.remove(plate);
			return true;
		} else {
			return false;
		}
	}

	public void printRegistrationPlates() {
		for(RegistrationPlate plate : this.vehicleRegistrations.keySet()) {
			System.out.println(plate);
		}
	}

	public void printOwners() {
		for(RegistrationPlate plate : this.vehicleRegistrations.keySet()) {
			System.out.println(this.vehicleRegistrations.get(plate));
		}
	}
}	