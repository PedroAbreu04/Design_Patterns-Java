package behavioural.strategy;

import java.io.File;

public class Context {
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void convert(File input, String output) {
		this.strategy.convert(input, output);
	}

}
