package s3_t2_niv1_ex1_montseliz;

public class Main_Observer {

	public static void main(String[] args) {
		
		Broker broker = new Broker(); 
		
		Rise_Stock_Exchange rise = new Rise_Stock_Exchange(broker); 
		Drop_Stock_Exchange drop = new Drop_Stock_Exchange(broker); 
		
		System.out.println("La prima de risc si inverteix un 5 % és la següent:");
		broker.setCondition(5);
		
		System.out.println("\r\nEn canvi, si inverteix un 2% la prima de risc és la següent:"); 
		broker.setCondition(2);
		
		rise.setValue(3.25f);
		drop.setValue(-1.75f);
		
		System.out.println("\r\nS'ha actualitzat la prima de risc i ara és més favorable invertir, perquè si inverteix un 5 %:");
		broker.setCondition(5);
		

	}

}
