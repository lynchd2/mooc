public class Cd implements ToBeStored {
	private int year;
	private String artist;
	private String title;
	private double weight;

	public Cd(String artist, String title, int year) {
		this.year = year;
		this.artist = artist;
		this.title = title;
		this.weight = 0.1;
	}

	public double weight() {
		return this.weight;
	}

	public String title() {
		return this.title;
	}

}