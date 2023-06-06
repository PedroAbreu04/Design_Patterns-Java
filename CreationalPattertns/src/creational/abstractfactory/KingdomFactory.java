package creational.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public interface KingdomFactory {

	public static KingdomFactory getInstance(String kingdomType) {
		
		try {
			KingdomFactory f = (KingdomFactory) Class
					.forName("creational.abstractfactory."+kingdomType+"Kingdom")
					.getDeclaredConstructor()
					.newInstance();
			return f;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Army createArmy();
	public Castle createCastle();
	public King createKing();

}
