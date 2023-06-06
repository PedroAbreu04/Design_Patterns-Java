package behavioural.command;

public class StockReceiver {
	private String ticker;
	private Integer quantity;
	private Double price;
	
	public StockReceiver(String ticker, Integer quantity, Double price) {
		this.ticker = ticker;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void buy() {
		System.out.printf("Buying %d from %s costing %f \n", quantity, ticker, price);
	}
	
	public void sell() {
		System.out.printf("Selling %d from %s costing %f \n", quantity, ticker, price);
	}
	
	public void rent() {
		System.out.printf("Renting %d from %s costing %f \n", quantity, ticker, price);
	}
	public void reserve() {
		System.out.printf("Reserving %d from %s costing %f \n", quantity, ticker, price);
	}
	
	

}
