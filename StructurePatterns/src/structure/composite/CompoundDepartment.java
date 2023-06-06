package structure.composite;

import java.util.List;
import java.util.ArrayList;

public class CompoundDepartment extends Department{
	private List<Department> children = new ArrayList<>();
	
	public CompoundDepartment (String name) {
		super(name);
	}
	
	public void add(Department department) {
		children.add(department);
	}
	public void remove(Department department) {
		children.remove(department);
	}
	
	@Override
	public void print() {
		children.forEach(Department::print);
	}
}
