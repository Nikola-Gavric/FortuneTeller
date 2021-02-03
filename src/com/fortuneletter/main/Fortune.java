package com.fortuneletter.main;

import java.util.LinkedList;

public class Fortune {
	public static void getFortune(LinkedList<Integer> sortedNumberList) {
		String[] fortune = new String[10];
		fortune[0] = "Get a life";
		fortune[1] = "You are toast";
		fortune[2] = "Don't get out of the house today";
		fortune[3] = "You'll get your ass kicked";
		fortune[4] = "Lucky day today";
		fortune[5] = "Not so lucky day today";
		fortune[6] = "Give up the fight";
		fortune[7] = "Lady will go gaga for you today";
		fortune[8] = "End of the road for you";
		fortune[9] = "You'll pee your pants today";
		
		int rand = RandomNumberGenerator.getRandomNumberFromList(sortedNumberList);
		Testclass.data.add(fortune[rand]);
	}
}
