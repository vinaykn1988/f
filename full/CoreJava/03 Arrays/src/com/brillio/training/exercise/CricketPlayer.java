package com.brillio.training.exercise;

public class CricketPlayer extends Player {

	private double averageRuns;
	
	public CricketPlayer() {
	}

	
	
	public CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName,lastName);
		this.averageRuns = averageRuns;
	}

	
	@Override
	public int getRating() {
	
		if(averageRuns > 70){
			return 5;
		}
		
		if(averageRuns > 55){
			return 4;
		}
		
		if(averageRuns > 35){
			return 3;
		}
		
		if(averageRuns > 20){
			return 2;
		}
		
		if(averageRuns <= 20){
			return 1;
		}
		
		return 0;
	}

}
