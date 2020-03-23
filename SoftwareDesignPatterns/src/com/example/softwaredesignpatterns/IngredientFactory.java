package com.example.softwaredesignpatterns;

public class IngredientFactory {

	public Ingredient getIngredient(String name) {
		if (name == null) {
			return null;
		}
		if (name.equals("ham")) {
			return new Ham();

		} else if (name.equals("tomato")) {
			return new Tomato();

		} else if (name.equals("bread")) {
			return new Bread();

		} else if (name.equals("cheese")) {
			return new Cheese();
		}

		return null;
	}
}
