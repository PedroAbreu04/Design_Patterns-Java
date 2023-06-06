package behavioural.state;

public class PlayState extends State{

	public PlayState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		player.changeStatus(new LockedState(player));
		player.setCurrentTrackAfterStop();
		return "Stop playing";
	}

	@Override
	public String onPlay() {
		player.changeStatus(new ReadyState(player));
		return "Paused";
	}

	@Override
	public String onNext() {
		return player.nextTrack();
	}

	@Override
	public String onPrevious() {
		return player.previouTrack();
	}

}
