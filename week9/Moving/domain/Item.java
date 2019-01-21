package domain;

import java.util.*;

public class Item implements Comparable<Item>, Thing {

	private String name;
	private int volume;

	public Item(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}

	public String getName() {
		return this.name;
	}

	public int getVolume() {
		return this.volume;
	}

	@Override
	public String toString() {
		return this.getName() + " (" + this.getVolume() + " dm^3)";
	}

	@Override
	public int compareTo(Item i) {
		if(this.getVolume() > i.getVolume()) {
			return 1;
		} else if(this.getVolume() < i.getVolume()) {
			return -1;
		} else {
			return 0;
		}
	}

}