package com.createiq.abstraction;

public class MGHector  extends  Car{


     

public MGHector(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged) {
		super(carName, color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
		// TODO Auto-generated constructor stub
	}

//    public MGHector(String carName, String color, int i, int j, int k, int l, int price, int mileage,
//			boolean isDamaged) {
//    	
//		 
//	}

	@Override
    public void startTheEngine() {
        System.out.println(" Electric Engine started..............");
    }
}
