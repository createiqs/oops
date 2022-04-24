package com.createiq.abstraction;

public class ToyotaFortuner extends Car {


 

	public ToyotaFortuner(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged) {
		super(carName, color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void startTheEngine() {
        System.out.println("A Toyota Fortuner Engine is started.");
    }
}
