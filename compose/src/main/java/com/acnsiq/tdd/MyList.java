package com.acnsiq.tdd;

/*
 * Based on example in "Refactoring to Patterns"
 * by Joshua Kerievsky
 * 
 * See https://www.industriallogic.com/xp/refactoring/composeMethod.html
 */

public class MyList {

	private static int INCREMENT_SIZE = 10;

	private Object[] elements = new Object[INCREMENT_SIZE];
	private boolean readOnly = false;
	private int numItems = 0;

	public void add(Object elementToAdd) {
		if (readOnly) { return; }

		if (shouldResize()) {
			resize()
		}

		addToEnd(elementToAdd)
	}

	private boolean shouldResize() {
		int newSize = numItems + 1
		return newSize > elements.length
	}

	private void resize() {
		Object[] newElements = new Object[elements.length + INCREMENT_SIZE];
		copyItemsInto(newElements)
		elements = newElements;
	}

	private void copyItemsInto(Object[] newElements) {
		for (int i = 0; i < numItems; i++) {
			newElements[i] = elements[i];
		}
	}

	private void addToEnd(Object elementToAdd) {
		elements[numItems] = element;
		numItems++;
	}

}
