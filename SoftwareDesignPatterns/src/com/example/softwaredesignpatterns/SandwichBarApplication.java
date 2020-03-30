package com.example.softwaredesignpatterns;

import java.util.ArrayList;
import java.util.List;

public class SandwichBarApplication {

	public static void main(String[] args) {

		// factory pattern
		IngredientFactory ingredientFactory = new IngredientFactory();

		Ingredient ham = ingredientFactory.getIngredient("ham");
		Ingredient tomato = ingredientFactory.getIngredient("tomato");
		Ingredient bread = ingredientFactory.getIngredient("bread");
		Ingredient cheese = ingredientFactory.getIngredient("cheese");

		Sandwich sandwich1 = new Sandwich("Ham and cheese Sandwich", "The best sandwich",
				List.of(ham, tomato, bread, cheese));
		Sandwich sandwich2 = new Sandwich("Ham Sandwich", "Not the best but good", List.of(ham, tomato, bread));
		Sandwich sandwich3 = new Sandwich("Sandwich", "Hmm not bad", List.of(tomato, bread));

		// composite pattern
		Employee barManager = new Employee("Juan Carlos", "Manager");

		Employee sandwichMaker1 = new Employee("Juan Alvares", "Sandwich maker");
		sandwichMaker1.addSandwich(sandwich1);

		Employee sandwichMaker2 = new Employee("Juan Pablo", "Sandwich maker");
		sandwichMaker2.addSandwich(sandwich2);

		Employee clerk1 = new Employee("Juan", "Clerk");
		clerk1.addSandwich(sandwich3);

		barManager.addSubordinate(sandwichMaker1);
		barManager.addSubordinate(sandwichMaker2);

		sandwichMaker1.addSubordinate(clerk1);

		List<Employee> noSubordinatedEmployee = new ArrayList<>();

		System.out.println(barManager);
		for (Employee headEmployee : barManager.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);

				if (employee.getSubordinates().isEmpty()) {
					noSubordinatedEmployee.add(employee);
				}
			}

			if (headEmployee.getSubordinates().isEmpty()) {
				noSubordinatedEmployee.add(headEmployee);
			}

		}

		// iterator
		ListInterface<Employee> list = new EmployeeList(noSubordinatedEmployee);

		Iterator<Employee> iterator = list.iterator();

		System.out.println();
		while (iterator.hasNext()) {
			Employee currentEmployee = iterator.next();
			System.out.println("Employee who hasn't got subordinates: " + currentEmployee.getName());
		}

	}

}
