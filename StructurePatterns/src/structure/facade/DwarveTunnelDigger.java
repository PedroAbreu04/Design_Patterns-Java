package structure.facade;

public class DwarveTunnelDigger extends DwarvenMineWorker{
	@Override
	public String name() {
		return "Dwarf Tunnel Operator";
	}

	@Override
	public void work() {
		LOG.info(name() + " creates a tunnel.");
		
	}

}
