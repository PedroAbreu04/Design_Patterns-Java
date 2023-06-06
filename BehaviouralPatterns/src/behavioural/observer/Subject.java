package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {

	private final List<Observer<T>> observers = new ArrayList<>();
	
	public void attach(Observer<T> obs) {
		observers.add(obs);
	}
	
	public void detach(Observer<T> obs) {
		observers.remove(obs);
	}
	
	public void notifyObservers(T arg) {
		observers.parallelStream().forEach(e -> e.update(arg));
	}
}
