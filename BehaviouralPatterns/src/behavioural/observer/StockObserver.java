package behavioural.observer;

public class StockObserver implements Observer<Product>{

	@Override
	public void update(Product t) {
		System.out.println("Upserting product " + t);
		
	}

}
