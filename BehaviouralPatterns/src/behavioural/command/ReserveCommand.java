package behavioural.command;

public class ReserveCommand implements Command {
	private StockReceiver receiver;
	
	public ReserveCommand(StockReceiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		this.receiver.reserve();

	}

}
