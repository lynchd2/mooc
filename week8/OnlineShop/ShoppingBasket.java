import java.util.*;

public class ShoppingBasket {

	private Map<String, Purchase> basketPurchases;

	public ShoppingBasket() {
		this.basketPurchases = new HashMap<String, Purchase>();
	}

	public void add(String product, int price) {
		Purchase purchase = new Purchase(product, 1 , price);
		this.basketPurchases.put(product, purchase);
	}

	public int price() {
		int total = 0;
		for(String purchase : this.basketPurchases.keySet()) {
			total += this.basketPurchases.get(purchase).price();
		}
		return total;
	}
}