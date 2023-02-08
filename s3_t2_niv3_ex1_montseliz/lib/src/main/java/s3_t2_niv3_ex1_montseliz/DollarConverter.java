package s3_t2_niv3_ex1_montseliz;

public class DollarConverter implements CoinConverter {

	@Override
	public double convert(double price) {
		return price * 1.07;
	}
		
}
