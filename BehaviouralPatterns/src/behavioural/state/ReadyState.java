package behavioural.state;

public class ReadyState extends State {

	public ReadyState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		player.changeStatus(new LockedState(player));
		return null;
	}

	@Override
	public String onPlay() {
		String action = player.startPlaying();
		player.changeStatus(new PlayState(player));
		return action;
	}

	@Override
	public String onNext() {
		return "Locked...";
	}

	@Override
	public String onPrevious() {
		return "Locked...";
	}

}
