package structure.flyweight;

public class App {
	public static void main(String[] args) {
		Widget clockBC = WidgetFactory.getWidget("clock");
		clockBC.draw("blue", "center");
		
		Widget clockRL = WidgetFactory.getWidget("clock");
		clockRL.draw("red", "left");
		
		Widget clockYR = WidgetFactory.getWidget("clock");
		clockYR.draw("yellow", "right");
		
		System.out.println("Number of objects: " + ClockWidget.counter);
		
	}
}
