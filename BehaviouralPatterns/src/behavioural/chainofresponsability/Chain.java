package behavioural.chainofresponsability;

public abstract class Chain {
	
	protected Chain nextChain;
	
	public void setNextChain ( Chain nextChain ) {
		this.nextChain = nextChain; 
	}
	
	public abstract void execute( Currency cur);
}
