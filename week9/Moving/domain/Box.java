package domain;

import domain.Thing;
import java.util.*;


public class Box implements Thing {

	private int maximumCapacity;
	private List<Thing> listOfThings;

	public Box(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
		this.listOfThings = new ArrayList<Thing>();
	}

	public int maximumCapacity() {
		return this.maximumCapacity;
	}

	public int getVolume() {
		int totalVolume = 0;
		for(Thing thing : this.listOfThings) {
			totalVolume = totalVolume + thing.getVolume();
		}
		return totalVolume;
	}

	public boolean addThing(Thing thing) {
		if(this.getVolume() + thing.getVolume() > this.maximumCapacity()) {
			return false;
		} else {
			this.listOfThings.add(thing);
			return true;
		}
	}
}