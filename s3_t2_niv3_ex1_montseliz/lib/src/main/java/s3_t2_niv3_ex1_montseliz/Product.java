package s3_t2_niv3_ex1_montseliz;

public class Product {

	private String name; 
	private double price; 
	
	public Product(String name, double price) {
		this.name = name; 
		this.price = price; 
		
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

	@Override
	public String toString() {
		return "El preu del producte " + this.name + " és " + this.price + ".";
	}

	
	
	
	
}
