package com.example.softwaredesignpatterns;

import java.util.List;

public class EmployeeList implements ListInterface<Employee> {

	private List<Employee> employee;

	public EmployeeList(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public Iterator<Employee> iterator() {
		return new EmployeeIterator(employee);
	}
}
