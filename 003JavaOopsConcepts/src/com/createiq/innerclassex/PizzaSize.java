package com.createiq.innerclassex;

public enum PizzaSize {

	SMALL("Small Size"), MEDIUM("Medium Size "), LARGE("Large Size ");

	private String pizzaSizeText;

	private PizzaSize(String pizzaSizeText) {
		this.pizzaSizeText = pizzaSizeText;
	}

	public String getPizzaSizeText() {
		return pizzaSizeText;
	}

}
