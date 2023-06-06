package behavioural.state;

public class NextState extends State{

	public NextState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		return null;
	}

	@Override
	public String onPlay() {
		return null;
	}

	@Override
	public String onNext() {
		return null;
	}

	@Override
	public String onPrevious() {
		return null;
	}

}
