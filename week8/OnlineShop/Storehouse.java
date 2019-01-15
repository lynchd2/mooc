import java.util.*;

public class Storehouse {

	private HashMap<String, Integer> products;

	public Storehouse() {
		this.products = new HashMap<String, Integer>();
	}

	public void addProduct(String product, int price, int stock) {
		this.products.put(product, price);
	}

	public int price(String product) {
		if(this.products.get(product) != null) {
			return this.products.get(product);
		} else {
			return -99;
		}
	}
}