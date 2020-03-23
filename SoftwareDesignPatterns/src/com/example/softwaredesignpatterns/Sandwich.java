package com.example.softwaredesignpatterns;

import java.util.List;

public class Sandwich {

	String name;

	String description;

	List<Ingredient> ingredients;

	public Sandwich(String name, String description, List<Ingredient> ingredients) {
		super();
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Ingredient> getIngredient() {
		return ingredients;
	}

	public void setIngredient(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		StringBuilder ingredientsInString = new StringBuilder();
		for (Ingredient ingr : ingredients) {
			ingredientsInString.append(ingr.name());
			ingredientsInString.append(", ");
		}
		ingredientsInString.deleteCharAt(ingredientsInString.length() - 2);
		return "Food [name=" + name + ", description=" + description + ", ingredients=" + ingredientsInString + "]";
	}

}
