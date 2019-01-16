import java.util.*;

public class ShoppingBasket {

	private Map<String, Purchase> basketPurchases;

	public ShoppingBasket() {
		this.basketPurchases = new HashMap<String, Purchase>();
	}

	public void add(String product, int price) {
		Purchase newPurchase = this.basketPurchases.get(product);
		if(newPurchase != null) {
			newPurchase.increaseAmount();
			this.basketPurchases.put(product,newPurchase );
		} else {
			Purchase purchase = new Purchase(product, 1 , price);
			this.basketPurchases.put(product, purchase);
		}

	}

	public int price() {
		int total = 0;
		for(String purchase : this.basketPurchases.keySet()) {
			total += this.basketPurchases.get(purchase).price();
		}
		return total;
	}

	public void print() {
		for(String purchaseName : this.basketPurchases.keySet()) {
			System.out.println(this.basketPurchases.get(purchaseName));
		}
	}
}