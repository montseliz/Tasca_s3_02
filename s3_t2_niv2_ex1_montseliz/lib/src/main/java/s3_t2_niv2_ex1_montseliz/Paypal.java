package s3_t2_niv2_ex1_montseliz;

public class Paypal implements Payment{

	@Override
	public void authorizedPayment() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pagament autoritzat. S'està processant el pagament amb Paypal...");
	}

	@Override
	public void unauthorizedPayment() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pagament no autoritzat. S'està cancel·lant el pagament amb Paypal...");
	}

}
