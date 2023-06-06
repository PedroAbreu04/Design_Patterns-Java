package behavioural.chainofresponsability;

import java.util.Scanner;

public class ATM {
	private Chain chain;
	
	public ATM() {
		chain = new Dispense50Chain();
		var c2 = new Dispense20Chain();
		var c3 = new Dispense10Chain();
		
		chain.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		int amount = 0;
			
		do{
			System.out.println("Enter amount to dispense or 0 to exit");
			amount = sc.nextInt();
			if( amount % 10 != 0 ) { 
				System.out.println("Amount should be multiple of 10");	
			} else if ( amount > 0 ) {
				atm.chain.execute(new Currency(amount));
			}
		} while (amount > 0);
			
		sc.close();
	}

}
