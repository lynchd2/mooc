import java.lang.Math;

public class BulkTank {


	private double capacity;
	private double currentVolume;
	public BulkTank() {
		this.capacity = 2000;
		this.currentVolume = 0;
	}

	public BulkTank(double capacity) {
		this.capacity = capacity;
		this.currentVolume = 0;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public double getVolumne() {
		return this.currentVolume;
	}

	public double howMuchFreeSpace() {
		return this.capacity = this.currentVolume;
	}

	public void addToTank(double amount) {
		if(this.currentVolume + amount >= this.capacity) {
			this.currentVolume = this.capacity;
		} else {
			this.currentVolume = this.currentVolume + amount;
		}
	}

	public double getFromTank(double amount) {
		if(this.currentVolume - amount <= 0) {
			double returnVolumne = this.currentVolume;
			this.currentVolume = 0;
			return returnVolumne;
		} else {
			this.currentVolume = this.currentVolume - amount;
			return amount;
		}
	}

	@Override
	public String toString() {
		return Math.ceil(this.currentVolume) + "/" + this.capacity;
	}
}