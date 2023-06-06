package structure.facade;

public class App {
	public static void main(String[] args) {
		DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade(); 
		facade.startNewDay();
		facade.dig();
		facade.endDay();
	}
}
