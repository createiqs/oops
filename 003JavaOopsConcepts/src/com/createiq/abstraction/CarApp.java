package com.createiq.abstraction;

public class CarApp {

	public static void main(String[] args) {
		MGHector redMGHector = new MGHector("MGHector", "red", (byte) 1, (short) 450, (short) 770, (short) 7700, 40000,
				154, true);
		System.out.println(redMGHector.getCarName() + "'s price is $" + redMGHector.getPrice());
		redMGHector.setPrice(-35000);
		System.out.println(redMGHector.getCarName() + "'s new price is $" + redMGHector.getPrice());
		System.out.println("The car is in city mode.");
		redMGHector.startTheEngine();
		System.out.println("The car has " + redMGHector.getMileage() + "miles");
		redMGHector.drive(0);
		System.out.println("After driving the car, it has " + redMGHector.getMileage() + "miles");

		System.out.println("----------------------------------------------");
		ToyotaFortuner blackToyotaFortuner = new ToyotaFortuner("ToyotaFortuner", " black", (byte) 1, (short) 225,
				(short) 717, (short) 3500, 40000, 15000, false);
		System.out.println(blackToyotaFortuner.getCarName() + "'s price is $" + blackToyotaFortuner.getPrice());
		blackToyotaFortuner.setPrice(32000);
		System.out.println(blackToyotaFortuner.getCarName() + "'s new price is $" + blackToyotaFortuner.getPrice());
		blackToyotaFortuner.startTheEngine();
		System.out.println("The car has " + blackToyotaFortuner.getMileage() + "miles");
		blackToyotaFortuner.drive(200);
		System.out.println("After driving the car, it has " + blackToyotaFortuner.getMileage() + "miles");
	}
}
