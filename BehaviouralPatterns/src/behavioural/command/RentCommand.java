package behavioural.command;

public class RentCommand implements Command {
	private StockReceiver receiver;
	
	public RentCommand(StockReceiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		this.receiver.rent();

	}

}
