package behavioural.command;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Thread worker = new Thread(new InvokerWorker());
		worker.start();
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		do {
			System.out.println("Submite a request or 0 to exit");
			String req = sc.nextLine();
			exit = "0".equals(req);
			if(!exit) {
				Command cmd = actionFactory(req);
				InvokerQueue.add(cmd);
			}
		}while(!exit);
		
		sc.close();
		

	}

	private static Command actionFactory(String req) {
		String[] parts = req.split(";");
		String action = parts[0];
		String ticker = parts[1];
		Integer qty = Integer.valueOf(parts[2]);
		Double price = Double.valueOf(parts[3]);
		
		switch (action) {
		case "buy": return new BuyCommand(new StockReceiver (ticker, qty, price)); 
		case "sell": return new SellCommand(new StockReceiver (ticker, qty, price));
		case "rent": return new RentCommand(new StockReceiver (ticker, qty, price)); 
		case "reserve": return new ReserveCommand(new StockReceiver (ticker, qty, price));
		default: throw new IllegalArgumentException("Unknown");
		}
	}

}
