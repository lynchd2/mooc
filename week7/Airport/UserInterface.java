import java.util.*;

public class UserInterface {

	public static void startSimulation(Scanner input, Airport airport) {
		System.out.println("Airport panel");
		System.out.println("--------------------");
		
		System.out.println("Choose operation:");
		System.out.println("[1] Add airplane");
		System.out.println("[2] Add flight");
		System.out.println("[x] Exit");
		airportPanelPath(input, airport);
	}

	public static void addFight(Scanner input, Airport airport){
		System.out.println("Give plane ID:");
		String planeId = input.nextLine();
		System.out.println("Give departure airport code: ");
		String departureCode = input.nextLine();
		System.out.println("Give desination airport code: ");
		String desinationCode = input.nextLine();
		airport.addFlight(departureCode, desinationCode, planeId);

		System.out.println("Choose operation:");
		System.out.println("[1] Add airplane");
		System.out.println("[2] Add flight");
		System.out.println("[x] Exit");
		airportPanelPath(input, airport);
	}

	public static void addAirplane(Scanner input, Airport airport) {
		System.out.println("Give plane ID:");
		String planeId = input.nextLine();
		System.out.println("Give plane capacity");
		int maxCapacity = Integer.parseInt(input.nextLine());

		airport.addPlane(maxCapacity, planeId);
		System.out.println("Choose operation:");
		System.out.println("[1] Add airplane");
		System.out.println("[2] Add flight");
		System.out.println("[x] Exit");
		airportPanelPath(input, airport);
	}

	public static void flightServiceIntroduction(Scanner input, Airport airport) {

		System.out.println("Flight service");
		System.out.println("------------");
		flightService(input, airport);
	}

	public static void flightService(Scanner input, Airport airport) {
		System.out.println("Choose operation:");
		System.out.println("[1] Print planes");
		System.out.println("[2] Print flights");
		System.out.println("[3] Print plane info");
		System.out.println("[x] Exit");
		flightServicePath(input, airport);
	}

	public static void getAllplanes(Scanner input, Airport airport) {
		airport.printAllPlanes();
		flightService(input, airport);
	}


	public static void getAllFlights(Scanner input, Airport airport) {
		airport.printAllFlights();
		flightService(input, airport);
	}

	public static void getPlaneInformation(Scanner input, Airport airport) {
		System.out.println("Give plane ID:");
		String flightId = input.nextLine();
		airport.findPlane(flightId);
		flightService(input, airport);
	} 
	public static void airportPanelPath(Scanner userInput, Airport airport) {
		String input = userInput.nextLine();
		if (input.equals("x")) {
			flightServiceIntroduction(userInput, airport);
			flightServicePath(userInput, airport);
		} else if (input.equals("1")) {
			addAirplane(userInput, airport);
		} else if (input.equals("2")) {
			addFight(userInput, airport);
		} else {
			System.out.println("That's not an option.");
			airportPanelPath(userInput, airport);
		}
	}



	public static void flightServicePath(Scanner userInput, Airport airport) {
		String input = userInput.nextLine();
		if (input.equals("x")) {
			System.exit(0);
		} else if (input.equals("1")) {
			getAllplanes(userInput, airport);
		} else if (input.equals("2")) {
			getAllFlights(userInput, airport);
		}  else if (input.equals("3")) {
			getPlaneInformation(userInput, airport);
		}  else {
			System.out.println("That's not an option.");
			airportPanelPath(userInput, airport);
		}
	}
}