package structure.facade;

public class DwarvenGoldDigger extends DwarvenMineWorker{

	@Override
	public String name() {
		return "Dwarf gold digger";
	}

	@Override
	public void work() {
		LOG.info(name() + " digs for gold.");
		
	}

}
