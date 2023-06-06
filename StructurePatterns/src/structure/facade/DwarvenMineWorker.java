package structure.facade;

import java.util.Arrays;
import java.util.logging.Logger;

public abstract class DwarvenMineWorker {
	
	protected static final Logger LOG = Logger.getLogger(DwarvenMineWorker.class.getName());
	
	public void goToSleep() {
		LOG.info(name() + " goes to sleep.");
	}
	public void wakeUP() {
		LOG.info(name() + " wake up.");
	}
	public void goToHome() {
		LOG.info(name() + " goes to home.");
	}
	public void goToMine () {
		LOG.info(name() + " goes to mine.");
	}
	
	private void action (Action action) {
		switch (action) {
		case GO_TO_SLEEP: goToSleep();
		case WAKE_UP: wakeUP();
		case GO_HOME: goToHome();
		case GO_TO_MINE: goToMine();
		case WORK: work();
		default: LOG.info("Undefined action");
		}
	}
	
	public void action(Action ...action) {
		Arrays.stream(action).forEach(this::action);
	}
	
	public abstract String name();
	public abstract void work();
	
	enum Action {
		GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK;
	}
	
}
