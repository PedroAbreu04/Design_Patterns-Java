package behavioural.chainofresponsability;

public class Dispense10Chain extends Chain {

	@Override
	public void execute(Currency cur) {
		if (cur.getAmount() >= 10 ) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			
			System.out.println("Dispensing " + num + " $10 notes");
			
			if(remainder > 0) this.nextChain.execute(new Currency(remainder));

		}
		else {
			this.nextChain.execute(cur);
		}
	}

}
