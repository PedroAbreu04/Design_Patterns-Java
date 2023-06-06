package structure.flyweight;

public class ClockWidget extends Widget{
	public static int counter;
	public ClockWidget() {
		super("clock", "coed to create a clock");
		counter++;
	}

	@Override
	public void draw(String color, String position) {
		System.out.println("Drowing a clock with: " + color + " in " + position);
		
	}

}
