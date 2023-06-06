package behavioural.interpreter;

public class NumberExpression extends Expression{
	private final int number;
	
	public NumberExpression(int number) {
		this.number = number;
	}
	
	@Override
	public int interpret() {
		return number;
	}

	@Override
	public String toString() {
		return Integer.toString(number);
	}

}
