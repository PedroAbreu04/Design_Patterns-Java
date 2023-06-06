package behavioural.chainofresponsability;

public class Dispense20Chain extends Chain {

	@Override
	public void execute(Currency cur) {
		if (cur.getAmount() >= 20 ) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			
			System.out.println("Dispensing " + num + " $20 notes");
			
			if(remainder > 0) this.nextChain.execute(new Currency(remainder));

		}
		else {
			this.nextChain.execute(cur);
		}
	}
	
	
}
