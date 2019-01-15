public class Airplane {

	private int capacity;
	private String id;

	public Airplane(int capacity, String id) {
		this.capacity = capacity;
		this.id = id;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public String getId() {
		return this.id;
	}

	public String toString() {
		return "Plane ID: " + this.getId() + ", Max capacity: " + this.getCapacity();
	}
}