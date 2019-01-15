import java.util.*;

public class Airport {
	
	private HashMap<String, Airplane> airplanes;
	private HashMap<String, Flight> flights;

	public Airport() {
		this.airplanes = new HashMap<String, Airplane>();
		this.flights = new HashMap<String, Flight>();
	}

	public void addPlane(int capacity, String planeId) {
		Airplane newPlane = new Airplane(capacity, planeId);
		this.airplanes.put(planeId, newPlane);
	}

	public void addFlight(String departureCode, String arrivalCode, String planeId){
		Flight newFlight = new Flight(departureCode, arrivalCode, planeId);
		this.flights.put(planeId, newFlight);
	}

	public void printAllPlanes() {
		for (String key : this.airplanes.keySet()) {
			System.out.println(this.airplanes.get(key));
		}
	}


	public void printAllFlights() {
		for (String key : this.flights.keySet()) {
			System.out.println(this.flights.get(key));
		}
	}

	public void findPlane(String planeId) {
		for (String key : this.airplanes.keySet()) {
			System.out.println(key);
			if(planeId.equals(key)) {
				System.out.println(this.airplanes.get(key));
			}
		}
	}
}