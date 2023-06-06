package structure.proxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Logger.getLogger(App.class.getPackageName());
		LogManager.getLogManager().getLogger(App.class.getPackageName()).setLevel(Level.WARNING);

		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Tupperware", 100.0));
		products.add(new Product(2, "Sorvete", 25.0));
		products.add(new Product(3, "Garrafa Térmica", 35.0));
		
		ProductDAO dao = new ProductDAOProxy(new ProductDAO(products));
		dao.findAll();
		dao.find(3);
		Product charger = new Product(4, "Carregador USB", 19.0);
		dao.save(charger);
		dao.delete(charger);
	}

}
