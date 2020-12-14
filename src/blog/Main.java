package blog;

import java.util.ArrayList;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		Employee emp1 = new Employee("Hannah Smokey-Glow", 25, "New York");
		Employee emp2 = new Employee("Manny MUA", 29, "California");
		Employee emp3 = new Employee("Jacklyn Hill", 37, "Florida");
		Employee emp4 = new Employee("Jen Luvs-Reviews", 37, "Ohio");
		Employee emp5 = new Employee("Laura Lee", 34, "Texas");
		
		List<Employee> myList = new ArrayList<>();
		myList.add(emp1);
		myList.add(emp2);
		myList.add(emp3);
		myList.add(emp4);
		myList.add(emp5);
	}

}
