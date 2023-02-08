package s3_t2_niv3_ex1_montseliz;

import java.util.List;

public class Shop {
	
	private List<Product> listProducts; 
	private CoinConverter converter; 
	
	public Shop(List<Product> listProducts, CoinConverter converter) {
		this.listProducts = listProducts; 
		this.converter = converter; 
	}

	public void showPrices() {
		listProducts.forEach(p -> { double priceConverted = converter.convert(p.getPrice());
		System.out.println("El preu del producte " + p.getName() + " és " + priceConverted + ".");
		}); 
	}
	
}