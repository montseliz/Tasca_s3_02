package s3_t2_niv2_ex1_montseliz;

public class Main_Shoe_Store {

	public static void main(String[] args) {
		
		Payment_Gateway payment1 = new Payment_Gateway(new CreditCard()); 
		payment1.authorizedPayment();
		
		System.out.println("--------------------");
		
		Payment_Gateway payment2 = new Payment_Gateway(new Paypal()); 
		payment2.unauthorizedPayment();
	
		System.out.println("--------------------");
		
		Payment_Gateway payment3 = new Payment_Gateway(new BankTransfer()); 
		payment3.authorizedPayment();
	
		
	}

}
