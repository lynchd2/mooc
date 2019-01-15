import java.util.*;


public class Suitcase{

	private int maxWeight;
	private ArrayList<Thing> things;

	public Suitcase(int maxWeight) {
		this.maxWeight = maxWeight;
		this.things = new ArrayList<Thing>();
	}

	public int totalWeight() {
		int totalWeight = 0;
		for(Thing thing : this.things) {
			totalWeight = totalWeight + thing.getWeight();
		}
		return totalWeight;
	}

	public void addThing(Thing thing) {
		if(thing.getWeight() + totalWeight() <= this.maxWeight){
			this.things.add(thing);
		}
	}

	public String totalThingsTranslation(int totalThings, int totalWeight) {
		if(totalThings == 0) {
			return "empty";
		} else if(totalThings == 1) {
			return totalThings + " thing (" + totalWeight + "kg)";
		} else{
			return totalThings + " things (" + totalWeight + "kg)";
		}
	}

	public Thing heaviestThing() {
		Thing heaviest = this.things.get(1);
		for(Thing thing : this.things) {
			if(heaviest.getWeight() <= thing.getWeight()) {
				heaviest = thing;
			}
		}
		return heaviest;
	}

	public void printThings() {
		for(Thing thing : this.things) {
			System.out.println(thing);
		}
	}


	public String toString() {
		int totalWeight = 0;
		for(Thing thing : this.things) {
			totalWeight = totalWeight + thing.getWeight();
		}
		return totalThingsTranslation(this.things.size(), totalWeight);
	}

}