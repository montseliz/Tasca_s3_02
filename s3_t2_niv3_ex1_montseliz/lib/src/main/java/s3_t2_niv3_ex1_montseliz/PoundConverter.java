package s3_t2_niv3_ex1_montseliz;

public class PoundConverter implements CoinConverter {

	@Override
	public double convert(double price) {
		return price * 0.89;
	}

}	