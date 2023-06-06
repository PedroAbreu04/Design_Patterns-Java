package behavioural.iterator;

import java.io.File;

public class App {

	public static void main(String[] args) {
		GetFile get = new GetFile("C:\\Users\\Familia Abreu\\Downloads");
		
		Iterator<File> iterator = get.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
