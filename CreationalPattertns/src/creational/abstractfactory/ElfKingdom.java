package creational.abstractfactory;

public class ElfKingdom implements KingdomFactory {

	public King createKing() {
		return new ElfKing();
	}
	
	public Castle createCastle() {
		return new ElfCastle();
	}
	
	public Army createArmy() {
		return new ElfArmy();
	}


	

}
