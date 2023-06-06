package structure.composite;

public class Department {
	Integer id;
	String name;
	
	public Department(String name) {
		this.id = (int)Math.round(Math.random()* 10);
		this.name = name;
	}
	
	public void print() {
		System.out.printf("[%d] [%s] \n", this.id, this.name);
	}
}
