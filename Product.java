import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {

	private String name;
	private double price;
	private double quantity;
	
	public Product(String name,	double price, double quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public void input(BufferedReader reader) throws IOException {
		System.out.println("Enter the name of product:");
		String name = reader.readLine();
		System.out.println("Enter the price of product:");
		double price = Double.parseDouble(reader.readLine());
		System.out.println("Enter the quantity of product:");
		double quantity = Double.parseDouble(reader.readLine());
	}
	
	public void output() {
		System.out.println("Name of product: " + name);
		System.out.println("Price of product: " + price);
		System.out.println("Quantity of product: " + quantity);
	}
	
	public Product mostExpensiveProduct(Product p) {
		return this.getPrice() > p.getPrice() ? this : p;
	
	}
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Product product1 = new Product();
		product1.input(reader);
		product1.output();
		
		Product product2 = new Product();
		product2.input(reader);
		product2.output();
		
		Product product3 = new Product();
		product3.input(reader);
		product3.output();
		
		Product product4 = new Product();
		product4.input(reader);
		product4.output();
	
		Product p = product4.mostExpensiveProduct(product3.mostExpensiveProduct(product1.mostExpensiveProduct(product2)));
		//System.out.println(p);

		p.output();
	}

}
