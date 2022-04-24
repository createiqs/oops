package com.createiq.innerclassex;

public class Pizza {
	private String name;
	private PizzaSize pizzaSize;
	private double prize;

	public Pizza(String name, PizzaSize pizzaSize) {
		this.name = name;
		this.pizzaSize = pizzaSize;
		this.prize = calculatePrize();
	}

	private double calculatePrize() {
		switch (pizzaSize) {
		case SMALL:
		default:
			return 139.00;
		case MEDIUM:
			return 350.00;
		case LARGE:
			return 950.00;
		}
	}

	public String getName() {
		return name;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public double getPrize() {
		return prize;
	}

	class PizzaSlice {
		public String calculateSlices() {
			switch (pizzaSize) {
			case SMALL:
			default:
				return "4 slices with pepper, tomoto souce only";
			case MEDIUM:
				return " 6 slices with pepper, sauce and applied extra ";
			case LARGE:
				return " 8 slices wiht pepper, mints and myoneace";
			}
		}
	}

}
