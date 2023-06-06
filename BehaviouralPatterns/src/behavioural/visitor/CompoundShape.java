package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{

	private List<Shape> children = new ArrayList<>();
	private int id;
	
	public CompoundShape(int id) {
		this.id = id;
	}

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void draw() {
		
		
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public List<Shape> getChildren(){
		return this.children;
	}
	
	public void add(Shape shape) {
		children.add(shape);
	}
	
	public int getId() {
		return id;
	}

}
