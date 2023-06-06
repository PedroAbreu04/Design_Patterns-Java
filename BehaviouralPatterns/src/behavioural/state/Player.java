package behavioural.state;

import java.util.Arrays;
import java.util.List;

public class Player {
	private State state;
	private boolean playing = false;
	private List<String> playlist = Arrays.asList("Track 1", "Track 2", "Track 3", "Track 4", "Track 5");
	private int currentTrack = 0;
	
	public Player() {
		this.state = new ReadyState(this);
		setPlaying(true);
	}

	public void setPlaying(boolean b) {
		this.playing = playing;
	}
	
	public boolean isPlaying() {
		return this.playing;
	}
	
	public String startPlaying() {
		return "Playing " + playlist.get(currentTrack);
	}
	
	public String nextTrack() {
		currentTrack++;
		if(currentTrack > playlist.size() - 1) {
			currentTrack = 0;
		}
		return "Playing " + playlist.get(currentTrack);
	}
	
	public String previouTrack(){
		currentTrack--;
		if(currentTrack < 0) {
			currentTrack = playlist.size() - 1;
		}
		return "Playing " + playlist.get(currentTrack);
	}
	
	public void setCurrentTrackAfterStop() {
		currentTrack = 0;
	}
	
	public void changeStatus (State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
}
