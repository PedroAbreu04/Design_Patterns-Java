package structure.facade;

import java.util.List;

public class DwarvenGoldmineFacade {
	private final List<DwarvenMineWorker> workers;
	
	public DwarvenGoldmineFacade() {
		workers = List.of(new DwarvenGoldDigger(), new DwaevenCartOperator(), new DwarveTunnelDigger());
	}
	
	public void startNewDay(){
		workers.forEach(w -> w.action(DwarvenMineWorker.Action.WAKE_UP,
				DwarvenMineWorker.Action.GO_TO_MINE));
	}
	
	public void dig() {
		workers.forEach(w -> w.action(DwarvenMineWorker.Action.WORK));
	}
	
	public void endDay() {
		workers.forEach(w -> w.action(DwarvenMineWorker.Action.GO_HOME,
				DwarvenMineWorker.Action.GO_TO_SLEEP));
		
	}
}
