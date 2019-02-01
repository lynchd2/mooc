import java.util.ArrayList;
import java.util.List;

public class Farm {

	private Barn barn;
	private String owner;
	private List<Cow> cows;

	public Farm(String farmOwner, Barn barn) {
		this.barn = barn;
		this.owner = farmOwner;
		this.cows = new ArrayList<Cow>();
	}

	public String getOwner() {
		return this.owner;
	}

	public void addCow(Cow cow) {
		this.cows.add(cow);
	}

 	public void liveHour() {
 		for(Cow cow : this.cows) {
 			cow.liveHour();
 		}
 	}

 	public void installMilkingRobot(MilkingRobot mr) {
 		this.barn.installMilkingRobot(mr);
 	}
 	public void manageCows() {
 		this.barn.takeCareOf(this.cows);
 	}

	public String getAnimals() {
		String animals = "";
		for(Cow cow : this.cows) {
			animals += cow.getName() + cow.toString() + "\n\r";
		}
		return animals;
	} 



	@Override
	public String toString() {
		return "Farm Owner: " + this.getOwner() + "\n\r" + "Barn bulk tank: " + this.barn.toString()  + "\n\r" + getAnimals();
	}
}