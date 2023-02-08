package s3_t2_niv3_ex1_montseliz;

import java.util.Arrays;
import java.util.List;

public class Main_DI {

	public static void main(String[] args) {
		
	List<Product> listProducts = Arrays.asList(new Product("poma", 3.4d), new Product ("pera", 2.25d), new Product ("plàtan", 3.99d), new Product ("pinya", 5.25d));

	System.out.println("Preu dels productes en €:");
	listProducts.forEach(System.out::println);
	
	System.out.println("\r\nLa conversió en £ és la següent:");
	Shop shop1 = new Shop(listProducts, new PoundConverter()); 
	shop1.showPrices();
	
	System.out.println("\r\nLa conversió en $ és la següent:");
	Shop shop2 = new Shop(listProducts, new DollarConverter()); 
	shop2.showPrices();
	
	System.out.println("\r\nLa conversió en ₹ és la següent:");
	Shop shop3 = new Shop(listProducts, new RupiaConverter()); 
	shop3.showPrices();
	
	
	}
	
}
