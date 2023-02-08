package s3_t2_niv1_ex1_montseliz;

public class Drop_Stock_Exchange extends Brokerage_Agency {

	private float value = -2.25f; 
	
	public Drop_Stock_Exchange(Broker broker) {
		this.broker = broker; 
		this.broker.addObservers(this);
	}
	
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public void update() {
		System.out.println("Les seves accions poden baixar un " + (broker.getCondition() * value) + " %.");
	}
	
	
	
}
