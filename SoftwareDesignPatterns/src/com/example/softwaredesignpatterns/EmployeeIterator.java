package com.example.softwaredesignpatterns;

import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {

	private List<Employee> employees;
	private int position;

	public EmployeeIterator(List<Employee> employees) {
		this.employees = employees;
		position = 0;
	}

	@Override
	public void reset() {
		position = 0;
	}

	@Override
	public Employee next() {
		return employees.get(position++);
	}

	@Override
	public Employee currentItem() {
		return employees.get(position);
	}

	@Override
	public boolean hasNext() {
		if (position >= employees.size())
			return false;
		return true;
	}
}
