package s3_t2_niv2_ex1_montseliz;

public class Payment_Gateway {

	private Payment payment; 
	
	public Payment_Gateway(Payment payment) {
		this.payment = payment; 
	}
	
	public void authorizedPayment() {
		payment.authorizedPayment();
	}
	
	public void unauthorizedPayment() {
		payment.unauthorizedPayment();
	}
}
