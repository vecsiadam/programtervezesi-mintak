package com.example.softwaredesignpatterns;

public interface Iterator<E> {
	void reset();

	E next();

	E currentItem();

	boolean hasNext();
}