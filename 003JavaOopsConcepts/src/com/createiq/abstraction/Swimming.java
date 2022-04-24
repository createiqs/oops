package com.createiq.abstraction;

import java.util.Date;

public abstract class Swimming extends Athelete implements OlymapicRules{

	public Swimming(String name, String nickName, Date dateOfBirth, String team, int numberOfMatches) {
		super(name, nickName, dateOfBirth, team, numberOfMatches);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getBioData() {
		super.getBioData();
	}

	public abstract void freeStyleSwimming();

}
