package behavioural.observer;

public class App {

	public static void main(String[] args) {
		ProductSubject subject = new ProductSubject();
		subject.attach(new FiscalObserver());
		subject.attach(new StockObserver());
		
		subject.add(new Product(1, "Smart TV", 1000.0));
		subject.add(new Product(2, "Smartphone", 2000.0));
		subject.add(new Product(3, "Smartwatch", 3000.0));
		
		subject.add(new Product(1, "Smart TV", 1000.0));
		subject.add(new Product(2, "Smartphone", 2000.0));
		subject.add(new Product(3, "Smartwatch", 3000.0));


	}

}
