package com.createiq.abstraction;

import java.util.Date;

public class CricketPlayer extends Athelete implements OlymapicRules{
	private int numberOfCenturies;
	private int numberOfOffcenturies;
	private int points;
	private double bowleningAverage;

	public CricketPlayer(String name, String nickName, Date dateOfBirth, String team, int numberOfMatches,
			int numberOfCenturies, int numberOfOffcenturies, int points, int bowleningAverage) {
		super(name, nickName, dateOfBirth, team, numberOfMatches);
		this.numberOfCenturies = numberOfCenturies;
		this.numberOfOffcenturies = numberOfOffcenturies;
		this.points = points;
		this.bowleningAverage = bowleningAverage;
	}

	@Override
	public void getBioData() {
		super.getBioData();
		System.out.println(" number of Centuries " + numberOfCenturies);
	}

	@Override
	public void compititions() {
		super.compititions();
		System.out.println(" number of points: " + points);
	}

	@Override
	public String bodyType() {
		return " body type is athletic  and  fully muscler body ";
	}

	@Override
	public String toString() {
		return "CricketPlayer [numberOfCenturies=" + numberOfCenturies + ", numberOfOffcenturies="
				+ numberOfOffcenturies + ", points=" + points + ", bowleningAverage=" + bowleningAverage + "]"+"\n";
	}

	@Override
	public void medicalQualification() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physicalTest() {
		// TODO Auto-generated method stub
		
	}
	
	

}
