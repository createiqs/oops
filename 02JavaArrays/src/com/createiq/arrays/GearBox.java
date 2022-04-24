package com.createiq.arrays;

public class GearBox {
	private Gear[] gears;
	private int maxGears;
	private int gearNumber;

	public GearBox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new Gear[1];
		Gear neutral = new Gear(0, 0.0);	
//		this.gears.add(neutral);
	}

	class Gear {
		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio=ratio;

		}
		
		public void add(Gear[] gear) {
			
		}
		
		public double driveSpeed(int revs) {
			return revs*(this.ratio);
		}
		
		

	}

}
