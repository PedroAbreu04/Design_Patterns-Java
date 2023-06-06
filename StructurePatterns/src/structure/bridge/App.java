package structure.bridge;

public class App {

	public static void main(String[] args) {
		Shape squere = new Squere(new Blue());
		String draw = squere.draw();
		System.out.println(draw);
		
		Shape redSquere = new Squere(new Red());
		String draw2 = redSquere.draw();
		System.out.println(draw2);
	}

}
