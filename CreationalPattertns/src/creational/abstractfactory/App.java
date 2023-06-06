package creational.abstractfactory;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.playWith("Orc");
	}
	
	public void playWith(String kingdomType) {
		KingdomFactory factory = KingdomFactory.getInstance(kingdomType);
		createKingdom(factory);
	}
	
	public void createKingdom(KingdomFactory factory) {
		Army army  = factory.createArmy();
		Castle castle = factory.createCastle();
		King king = factory.createKing();
	}

}
