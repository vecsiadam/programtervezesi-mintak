package com.example.softwaredesignpatterns;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private List<Sandwich> sandwiches;
	private List<Employee> subordinates;

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
		sandwiches = new ArrayList<Sandwich>();
		subordinates = new ArrayList<Employee>();
	}

	public void addSubordinate(Employee e) {
		subordinates.add(e);
	}

	public void addSandwich(Sandwich s) {
		sandwiches.add(s);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public List<Sandwich> getSandwiches() {
		return sandwiches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder employeesNames = new StringBuilder();
		if (!subordinates.isEmpty()) {
			for (Employee employee : subordinates) {
				employeesNames.append(employee.getName());
				employeesNames.append(", ");
			}
			employeesNames.deleteCharAt(employeesNames.length() - 2);
		}

		return dept + "[name=" + name + ", dept=" + dept + ", sandwiches=" + sandwiches + ", subordinates="
				+ employeesNames.toString() + "]";
	}

}
