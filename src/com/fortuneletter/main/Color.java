package com.fortuneletter.main;

import java.util.ArrayList;
import java.util.LinkedList;

public class Color {
	public static void luckyColor(LinkedList<Integer> sortedNumberList) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("blue");
		color.add("green");
		color.add("red");
		color.add("orange");
		color.add("voilent");
		color.add("yellow");
		color.add("pink");
		color.add("purple");
		color.add("black");
		color.add("peach");
		
		int rand = RandomNumberGenerator.getRandomNumberFromList(sortedNumberList);
		
		
		Testclass.data.add(color.get(rand));

	}

}
