package com.createiq.abstraction;

import java.util.Date;

import com.createiq.inheritencedemo.Vehicle;

//implements OlymapicRules, EuropeanAthleticsChampionships
public abstract class Athelete {

	private String name;
	private String nickName;
	private Date dateOfBirth;
	private String team;
	private int numberOfMatches;

	public Athelete(String name, String nickName, Date dateOfBirth, String team, int numberOfMatches) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.team = team;
		this.numberOfMatches = numberOfMatches;
	}

	public String getName() {
		return this.name;
	}

	public String getNickName() {
		return this.nickName;
	}

	public String getTeam() {
		return team;
	}

	public void getBioData() {
		System.out.println("full name:  " + getName());
		System.out.println("Nick name:  " + getNickName());
		System.out.println("Team Name:  " + getTeam());

	}

	public void compititions() {
		System.out.println(" no of world compititions played: " + numberOfMatches);

	}

	public abstract String bodyType();

//	@Override
//	public void medicalQualification() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void physicalTest() {
//		// TODO Auto-generated method stub
//
//	}

}
