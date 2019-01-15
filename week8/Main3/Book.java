public class Book implements ToBeStored {
	private String author;
	private String title;
	private double weight;

	public Book(String author, String title, double weight) {
		this.weight = weight;
		this.author = author;
		this.title = title;
	}

	public double weight() {
		return this.weight;
	}

	public String title() {
		return this.title;
	}


}