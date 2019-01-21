package logic;

import java.util.*;
import domain.Thing;
import domain.Box;

public class Packer {

	private int boxesVolumne;
	
	public Packer(int boxesVolumne) {
		this.boxesVolumne = boxesVolumne;
	}

	public List<Box> packThings(List<Thing> things) {
		List<Box> boxes = new ArrayList<Box>();
		Box box = new Box(10);
		for(Thing thing : things) {
			if (!box.addThing(thing)) {
				boxes.add(box);
				box = new Box(10);
				box.addThing(thing);
			}
		}
		boxes.add(box);
		return boxes;
	}

}