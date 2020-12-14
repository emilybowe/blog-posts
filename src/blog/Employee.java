package blog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private int age;
	private String location;
	
	Employee(String name, int age, String location) {
		name = this.getName();
		age = this.getAge();
		location = this.getLocation();
	}
	
	Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void findEmployeeByName(ArrayList<Employee> list) {
		list.stream()
		.filter(currentEmp -> currentEmp.getName().equals("Jen Luvs-Reviews"))
		.collect(Collectors.toList());
	}

}



