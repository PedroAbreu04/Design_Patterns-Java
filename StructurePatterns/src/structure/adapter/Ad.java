package structure.adapter;

public class Ad {
	String description;
	Double price;
	String status;
	
	public void publish() {
		System.out.println("Ad publishing...");
	}
	
	public void delete() {
		System.out.println("Ad deleting...");
	}
}
