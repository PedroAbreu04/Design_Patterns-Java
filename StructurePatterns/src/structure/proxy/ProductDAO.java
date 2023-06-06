package structure.proxy;

import java.util.List;
import java.util.Random;

public class ProductDAO {
	private List<Product> products;
	
	public ProductDAO(List<Product> product) {
		this.products = product;
	}
	
	public List<Product> findAll(){
		this.simulateDelay();
		return this.products;
	}
	
	public Product find(Integer id) {
		this.simulateDelay();
		return this.products.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
	}
	
	public void save(Product product) {
		this.simulateDelay();
		this.products.add(product);
	}
	
	public void delete(Product product) {
		this.simulateDelay();
		this.products.remove(product);
	}
	
	private void simulateDelay() {
		Random r = new Random();
		try {
			Thread.sleep(r.nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
