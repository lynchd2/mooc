public class MilkingRobot {


	private BulkTank bulkTank;

	public MilkingRobot() {
		this.bulkTank = null;
	}

	public BulkTank getBulkTank() {
		return this.bulkTank;
	}

	public void setBulkTank(BulkTank bulkTank) {
		this.bulkTank = bulkTank;
	}

	public void milk(Milkable milkable) {
		if(this.bulkTank == null) {
			throw new IllegalStateException("There is no bulk tank hooked up");
		} else {
			this.bulkTank.addToTank(milkable.milk());
		}
	}
}