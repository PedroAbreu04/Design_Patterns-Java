package behavioural.state;

public class PreviousState extends State{

	public PreviousState(Player player) {
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
