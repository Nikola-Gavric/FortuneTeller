package com.fortuneletter.main;
import java.util.LinkedList;


public class LuckyNumber {
	public static void getLuckyNumber(LinkedList<Integer> sortedNumberList) {
		int rand = RandomNumberGenerator.getRandomNumberFromList(sortedNumberList);
		Testclass.data.add(rand);
	}

}
