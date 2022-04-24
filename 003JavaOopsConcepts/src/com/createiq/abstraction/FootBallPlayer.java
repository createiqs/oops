package com.createiq.abstraction;

import java.util.Date;

public class FootBallPlayer extends Athelete {

	private int playerYards;
	private int completionyards;
	private String franchazies;

	public FootBallPlayer(String name, String nickName, Date dateOfBirth, String team, int numberOfMatches,
			int playerYards, int completionyards, String franchazies) {
		super(name, nickName, dateOfBirth, team, numberOfMatches);
		this.completionyards = completionyards;
		this.playerYards = playerYards;
		this.franchazies = franchazies;
	}

	@Override
	public void getBioData() {
		super.getBioData();
		System.out.println(" current team franchazies " + franchazies);

	}

	@Override
	public void compititions() {
		super.compititions();
		System.out.println(" plyer running yards:  " + playerYards);
	}

	@Override
	public String bodyType() {
		return " musculer strength , atheletic and sprinter ";
	}

	@Override
	public String toString() {
		return "FootBallPlayer [playerYards=" + playerYards + ", completionyards=" + completionyards + ", franchazies="
				+ franchazies + "]" + "\n";
	}

}
