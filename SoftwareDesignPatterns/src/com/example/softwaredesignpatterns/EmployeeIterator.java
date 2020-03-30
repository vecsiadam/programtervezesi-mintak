package com.example.softwaredesignpatterns;

import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {

	private List<Employee> employee;
	private int position;

	public EmployeeIterator(List<Employee> employee) {
		this.employee = employee;
		position = 0;
	}

	@Override
	public void reset() {
		position = 0;
	}

	@Override
	public Employee next() {
		return employee.get(position++);
	}

	@Override
	public Employee currentItem() {
		return employee.get(position);
	}

	@Override
	public boolean hasNext() {
		if (position >= employee.size())
			return false;
		return true;
	}
}
