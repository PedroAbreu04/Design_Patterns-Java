package creational.prototype;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.document = 1234567L;
		s1.name = "John";
		System.out.println(s1);
		
		Student s2 = (Student) s1.copy();
		s2.document = 9876654L;
		s2.name = "Smith";
		System.out.println(s2);
	}
}
