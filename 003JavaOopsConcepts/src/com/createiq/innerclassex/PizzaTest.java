package com.createiq.innerclassex;

public class PizzaTest {
// 		int waitedMinutes;
	public static boolean isReady(final int waitedMinutes) {
		class Oven {

			public boolean isBackedProperly() {
				if (waitedMinutes > 30) {
					return true;
				}
				return false;
			}
		}
		Oven oven = new Oven();
		return oven.isBackedProperly();

	}

	public static void main(String[] args) {

		Pizza mexicanVeg = new Pizza("Mexican Cheese", PizzaSize.MEDIUM);
		System.out.println("pizzatype: " + ColorTheme.ANSI_GREEN + mexicanVeg.getName() + ColorTheme.ANSI_BLACK);
		System.out.println("SIZE: " + ColorTheme.ANSI_PURPLE + mexicanVeg.getPizzaSize() + ColorTheme.ANSI_BLACK);
		System.out.println("price: " + ColorTheme.ANSI_CYAN + mexicanVeg.getPrize() + ColorTheme.ANSI_BLACK + " ₹ ");

		if (isReady(50)) {
			System.out.println(" pizza is ready");
		} else {
			System.out.println(" not prepared wait for some time to get the ready");
		}
		Pizza cheeseItalianPizza = new Pizza("Italiane Cheese", PizzaSize.LARGE);
		Pizza.PizzaSlice noOfslice = cheeseItalianPizza.new PizzaSlice();
		System.out.println(cheeseItalianPizza.getName());
		System.out.println(cheeseItalianPizza.getPizzaSize().getPizzaSizeText());
		System.out.println(cheeseItalianPizza.getPrize());
		System.out.println(noOfslice.calculateSlices());

	}

}
