
public class ShoppingCart extends Product {
	private int qty;
	private double total;

	public void addProduct(Product p, int qty) {
		System.out.println("product added to cart");

		p.stock = p.stock - this.qty;
		total = p.price * this.qty;

	}

	public void summary(Product p) {
		System.out.println("product name is" + p.name + "price of product" + p.price);
		System.out.println("TOTAL PRICE" + total);
	}
}
