package com.brillio.training.programs;

import com.brillio.training.exercise.CricketPlayer;
import com.brillio.training.exercise.FootballPlayer;
import com.brillio.training.exercise.Player;

public class Program04 {

	public static void main(String[] args) {
		
		Player[] players = new Player[10];
		
		players[0] = new CricketPlayer("AB","De villers",99);
		players[1] = new CricketPlayer("Hashim","Amla",90);
		players[2] = new CricketPlayer("Faf","Du Plessis",87);
		players[3] = new CricketPlayer("Albie","Morkel",56);
		players[4] = new CricketPlayer("Imran","Tahir",23);
		
		
		players[5] = new FootballPlayer("Cristiano","Ronaldo",25);
		players[6] = new FootballPlayer("Lionel","Messi",24);
		players[7] = new FootballPlayer("Didier","Drogba",15);
		players[8] = new FootballPlayer("Neymar","Jr",10);
		players[9] = new FootballPlayer("Gareth","Bale",5);
		
		for (Player player : players) {
			
			System.out.print(player.getName() + ",  " + player.getClass().getSimpleName() + "(Rating:");
			for (int i = 0; i < player.getRating(); i++) {
				System.out.print("*");
				
			}
			System.out.println(")");
		}
		
	}
	
}
