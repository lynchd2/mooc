import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

public class Cow implements Milkable, Alive {

	private String name;
	private double udderCapacity;
	private double milkAmount;

	public Cow(){
		this.name = generateName();
		this.udderCapacity = (int) (Math.random() * 25 + 15);
	}

	public Cow(String name) {
		this.name = name;
		this.udderCapacity = (int) (Math.random() * 25 + 15);
	}

	public String getName() {
		return this.name;
	}

	public double getCapacity() {
		return this.udderCapacity;
	}

	public double getAmount() {
		return this.milkAmount;
	}
	public double milk() {
		double takenMilk = this.milkAmount;
		this.milkAmount = 0;
		return takenMilk;
	}

	public void liveHour(){
		List randomMilkGenerator = new ArrayList<Double>();
		randomMilkGenerator.add((double)0.7);
		randomMilkGenerator.add((double)0.8);
		randomMilkGenerator.add((double)0.9);
		randomMilkGenerator.add((double)1.0);
		randomMilkGenerator.add((double)1.1);
		randomMilkGenerator.add((double)1.2);
		randomMilkGenerator.add((double)1.3);
		randomMilkGenerator.add((double)1.4);
		randomMilkGenerator.add((double)1.5);
		randomMilkGenerator.add((double)1.6);
		randomMilkGenerator.add((double)1.7);
		randomMilkGenerator.add((double)1.8);
		randomMilkGenerator.add((double)1.9);
		randomMilkGenerator.add((double)2.0);
		int rand = (int) (Math.random() * 10 + 3);
		this.milkAmount = this.milkAmount + (double) randomMilkGenerator.get(rand);
	}

	public String generateName() {
		int numberOfCharacters = (int)(Math.random() * 10);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String name = "";
		for(int i = 0; i < numberOfCharacters;i++) {
			int currentIndexOfAlphabet = (int) (Math.random() * 10 + 15);
			name = name + alphabet.charAt(currentIndexOfAlphabet);
		}
		return name;
	}

	public String toString() {
		return this.name + " " + this.milkAmount + "/" + this.udderCapacity;
	}
}