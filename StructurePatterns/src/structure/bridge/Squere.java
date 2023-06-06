package structure.bridge;

public class Squere extends Shape{
	public Squere(Color color) {
	super(color);
}

@Override
	public String draw() {
		return "Squere draw with " + color.fill();
	}

}
