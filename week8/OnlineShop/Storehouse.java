import java.util.*;

public class Storehouse {

	private HashMap<String, Integer> productPrices;
	private HashMap<String, Integer> productStock;

	public Storehouse() {
		this.productPrices = new HashMap<String, Integer>();
		this.productStock = new HashMap<String, Integer>();
	}

	public void addProduct(String product, int price, int stock) {
		this.productPrices.put(product, price);
		this.productStock.put(product, stock);
	}

	public int price(String product) {
		if(this.productPrices.get(product) != null) {
			return this.productPrices.get(product);
		} else {
			return -99;
		}
	}

	public int stock(String product) {
		if(this.productStock.get(product) != null && this.productStock.get(product) > 0) {
			return this.productStock.get(product);
		} else {
			return 0;
		}
	}

	public boolean take(String product) {
		if(this.productStock.get(product) != null) {
			this.productStock.put(product, this.productStock.get(product) - 1);
			return true;
		} else {
			return false;
		}
	}

	public Set<String> products() {
		Set<String> productSet = new HashSet<String>();
		for(String key : this.productStock.keySet()) {
			productSet.add(key);
		}
		return productSet;
	}
}