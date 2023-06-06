package structure.composite;

public class App {

	public static void main(String[] args) {
		CompoundDepartment clevel = new CompoundDepartment("C-Level");
		CompoundDepartment tech = new CompoundDepartment("Technology");
		CompoundDepartment mkt = new CompoundDepartment("Marketing");
		CompoundDepartment hr = new CompoundDepartment("Human Resource");
		
		clevel.add(tech);
		clevel.add(mkt);
		clevel.add(hr);
		
		tech.add(new Department("Soft. Eng."));
		tech.add(new Department("Design"));
		
		mkt.add(new Department("Branding"));
		
		hr.add(new Department("Recruitment"));
		hr.add(new Department("Hunting"));
		
		CompoundDepartment dataeng =  new CompoundDepartment("Data Eng.");
		tech.add(dataeng);
		
		dataeng.add(new Department("BI"));
		dataeng.add(new Department("Data Mining"));
		
		clevel.print();
	}

}
