package structure.flyweight;

public abstract class Widget {
	private final String name;
	private final String content;
	
	public Widget(String name, String content) {
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}
	
	public abstract void draw(String color, String position);
	
}
