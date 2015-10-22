package com.brillio.training.exercise;

public class FootballPlayer extends Player {

	private int goals;
	
	public FootballPlayer() {
	}

	
	public FootballPlayer(String firstName, String lastName, int goals) {
		super(firstName, lastName);
		this.goals = goals;
	}

	@Override
	public int getRating() {

		if(goals > 20){
			return 5;
		}
		
		if(goals > 15){
			return 4;
		}
		
		if(goals > 10){
			return 3;
		}
		
		if(goals > 5){
			return 2;
		}
		
		if(goals <= 5){
			return 1;
		}
		
		return 0;
	}

}
