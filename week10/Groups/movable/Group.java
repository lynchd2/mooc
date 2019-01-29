package movable;

import movable.Movable;
import movable.Organism;
import java.util.List;
import java.util.ArrayList;

public class Group implements Movable {

	private List<Movable> organisms;
	
	public Group() {
		this.organisms = new ArrayList<Movable>();
	}


	public void addToGroup(Movable movable) {
		this.organisms.add(movable);
	}

	@Override
	public String toString() {
		for(Movable movable : this.organisms) {
			System.out.println(movable);
		}
		return "";
	}

	public void move(int dx, int dy) {
		for(Movable movable : this.organisms) {
				movable.move(dx, dy);
		}
	}
}