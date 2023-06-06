package creational.prototype;

public class Student extends Person {
	
	Student(){
		System.out.println("Long time to build...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
