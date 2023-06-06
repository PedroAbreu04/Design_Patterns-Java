package behavioural.chainofresponsability;

public class Dispense50Chain extends Chain {

	@Override
	public void execute(Currency cur) {
		if (cur.getAmount() >= 50 ) {
			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			
			System.out.println("Dispensing " + num + " $50 notes");
			
			if(remainder > 0) this.nextChain.execute(new Currency(remainder));

		}
		else {
			this.nextChain.execute(cur);
		}
	}

}
