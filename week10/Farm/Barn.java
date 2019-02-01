import java.util.Collection;

public class Barn {

	private BulkTank bulkTank;
	private MilkingRobot milkingRobot;

	public Barn(BulkTank bulkTank) {
		this.bulkTank = bulkTank;
		this.milkingRobot = null;
	}

	public BulkTank getBulkTank() {
		return this.bulkTank;
	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.milkingRobot = milkingRobot;
		this.milkingRobot.setBulkTank(this.bulkTank);
	}

	public void takeCareOf(Cow cow) {
		if (this.milkingRobot == null) {
			throw new IllegalStateException ("Milking Robot has not been installed");
		} else {
			milkingRobot.milk(cow);
		}
	}

	public void takeCareOf(Collection<Cow> cows) {
			if (this.milkingRobot == null) {
				throw new IllegalStateException ("Milking Robot has not been installed");
			} else {
				for(Cow cow : cows) {
					milkingRobot.milk(cow);
				}
			}
	}

	public String toString() {
		return "Barn: " + this.bulkTank.getVolumne() + "/" + this.bulkTank.getCapacity();
	}
}