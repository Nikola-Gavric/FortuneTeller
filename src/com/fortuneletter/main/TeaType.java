package com.fortuneletter.main;

import java.util.ArrayList;
import java.util.LinkedList;

public class TeaType {
	public static void getTeaType(LinkedList<Integer> sortedNumberList) {

		ArrayList<String> teatype = new ArrayList<String>();

		teatype.add("Green tea");
		teatype.add("Black tea");
		teatype.add("white tea");
		teatype.add("Fermented tea");
		teatype.add("Yellow tea");
		teatype.add("Herbal tea");
		teatype.add("Dark tea");
		teatype.add("Puer tea");
		teatype.add("Oolong tea");
		teatype.add("Milk tea");
		
		int rand = RandomNumberGenerator.getRandomNumberFromList(sortedNumberList);
		Testclass.data.add(teatype.get(rand));

	}
}
