public class Flight {

	private String departureCode;
	private String arrivalCode;
	private String flightId;

	public Flight(String departureCode, String arrivalCode, String flightId) {
		this.departureCode = departureCode;
		this.arrivalCode = arrivalCode;
		this.flightId = flightId;
	}

	public String getDepartureCode() {
		return this.departureCode;
	}

	public String getArrivalCode() {
		return this.arrivalCode;
	}

	public String getFlightId() {
		return this.flightId;
	}

	public String toString() {
		return "Flight ID: " + this.getFlightId() + ", Departure Code:" + this.getDepartureCode() + ", Arrival Code:" + this.getArrivalCode();
	}

}