package behavioural.visitor;

public class Dot implements Shape {

	private int id;
	private int x;
	private int y;

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Dot(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
