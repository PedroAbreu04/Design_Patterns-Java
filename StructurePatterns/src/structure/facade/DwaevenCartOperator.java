package structure.facade;

public class DwaevenCartOperator extends DwarvenMineWorker{

	@Override
	public String name() {
		return "Dwarf Cart Operator";
	}

	@Override
	public void work() {
		LOG.info(name() + " moves for gold.");
		
	}

}
