package behavioural.templatemethod;

public class App {

	public static void main(String[] args) {
//		DataParser parser = new XMLParser();
//		parser.path = "./data/templete.html";
//		parser.sanitize();
		
		DataParser parser = new XLSXParser();
		parser.path = "./data/templete.xlsx";
		parser.sanitize();

	}

}
