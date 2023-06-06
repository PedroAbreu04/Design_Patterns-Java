package structure.decorator;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;

public class App {

	public static void main(String[] args) throws Exception {
		File file = new File("./data/sample.txt");
		Reader reader = new FileReader(file);
		
//		int ch = 0;
//		while ((ch = reader.read()) != -1) {
//			System.out.println((char)ch);
//		}
		
		BufferedReader bufReader = new BufferedReader(reader);
//		System.out.println(bufReader.readLine());
		bufReader.lines().forEach(System.out::println);
	}

}
