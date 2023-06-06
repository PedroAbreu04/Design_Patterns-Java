package behavioural.interpreter;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		String token = "4 3 2 - 1 + *";
		
		Stack<Expression> stack = new Stack<Expression>();
		
		String[] tokenList =  token.split(" ");
		for(String s : tokenList) {
			if(isOperator(s)) {
				Expression re = stack.pop();
				Expression le = stack.pop();
				System.out.printf("Popped from stack left: %s, right: %s \n", re, le);
				Expression op = getOperator(s, le, re);
				int result = op.interpret();
				System.out.printf("Interpreted %s %s %s \n", le, op, re);
				Expression resultExp = new NumberExpression(result);
				stack.push(resultExp);
				System.out.printf("Push result to stack: %s \n", resultExp.interpret());
			}else {
				NumberExpression i = new NumberExpression(Integer.parseInt(s));
				stack.push(i);
				System.out.printf("Push to stack: %s \n", i.interpret());
			}
		}
	}

	private static Expression getOperator(String s, Expression le, Expression re) {
		switch (s) {
		case "+": return new PlusExpression(le, re);
		case "-": return new MinusExpression(le, re);
		case "*": return new MultiplyExpression(le, re);
		default: throw new IllegalArgumentException("Unexpected value: " + s);
		}
	}

	private static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*");
	}
}
