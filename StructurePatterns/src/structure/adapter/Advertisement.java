package structure.adapter;

public class Advertisement {
	String title;
	String description;
	Double price;
	AdvertisementStatus status = AdvertisementStatus.DRAFT;
	
	public Advertisement(String title, String description, Double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	public void publish() {
		System.out.println("Advertisement publishment process...");
	}
	public void inactivate() {
		System.out.println("Advertisement inactivation process...");
	}
	public void activate() {
		System.out.println("Advertisement activation process...");
	}
	public void delete() {
		System.out.println("Advertisement deletion process...");
	}
}
