package s3_t2_niv1_ex1_montseliz;

import java.util.ArrayList;

// Observable (subjecte en observació)
public class Broker {

	private ArrayList<Brokerage_Agency> observers = new ArrayList<>(); 
	private int condition; 
	
	public int getCondition() {
		return condition; 
	}
	
	public void setCondition(int condition) {
		this.condition = condition; 
		notifyAllObservers(); 
	}
	
	public void addObservers(Brokerage_Agency observer) {
		observers.add(observer); 
	}
	
	public void notifyAllObservers() {
		observers.forEach(x -> x.update());
	}
	
}
