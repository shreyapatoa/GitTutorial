
public class Product {
	protected String name;
	protected double price;
	protected int stock;

	public Product() {
		
	}

	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	};

	void productDetails() {
		System.out.println("Name of product" + name);
		System.out.println("price of product" + price);
		if (stock >= 1) {
			System.out.println("In stock");
			System.out.println("Hurry only " + stock + "Products left");

		} else
			System.out.println("Out Of Stock");
	}

}
