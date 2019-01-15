import java.util.*;

public class Box {

	private double maxWeight;
	private HashMap<ToBeStored, String> thingsinBox;

	public Box(int maxWeight) {
		this.thingsinBox = new HashMap<ToBeStored, String>();
		this.maxWeight = maxWeight;
	}

	public void add(ToBeStored object) {
		if(this.weight() + object.weight() <= maxWeight) {
			this.thingsinBox.put(object, object.title());
		}
	}

	public double weight() {
		double currentWeight = 0.0;
		for (ToBeStored object : thingsinBox.keySet()) {
			currentWeight = currentWeight + (double) object.weight();
		}
		return currentWeight;
	}

	@Override
	public String toString() {
		return "Box: " + this.thingsinBox.size() + ", total weight: " + this.weight() + " kg ";
	}


}