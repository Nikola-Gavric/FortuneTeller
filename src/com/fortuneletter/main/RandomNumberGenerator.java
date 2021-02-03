package com.fortuneletter.main;

import java.util.LinkedList;
import java.util.Random;

import com.sorting.main.MainClass;
import com.sorting.main.SortArray;

public class RandomNumberGenerator {
	
	public static int getSingleDigit(long number) {
		long oneDigit = number;
		while(oneDigit > 9) {
			long temp = oneDigit;
			long sum = 0;
			while(temp > 0) {
				int lastDigit = (int) (temp % 10);
				
				sum += lastDigit;
				
				temp = temp / 10;
			}
			oneDigit = sum;
		}
		return (int) oneDigit;
	}
	
	
	public static int getSingleDigit(int number) {
		int oneDigit = number;
		while(oneDigit > 9) {
			int temp = oneDigit;
			int sum = 0;
			while(temp > 0) {
				int lastDigit = temp % 10;
				
				sum += lastDigit;
				
				temp = temp / 10;
			}
			oneDigit = sum;
		}
		return oneDigit;
	}


	public static LinkedList<Integer> getSortedNumberList(String name, int day, int month, long time) {
		int nameCharSum = getCharSum(name);
		
		int nameNumber = getSingleDigit(nameCharSum);
		int dayNumber = getSingleDigit(day);
		int monthNumber = getSingleDigit(month);
		int timeNumber = getSingleDigit(time);
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(nameNumber);
		list.add(dayNumber);
		list.add(monthNumber);
		list.add(timeNumber);
		
		list = new SortArray().sort(list, list.size());
		
		return list;
	}


	private static int getCharSum(String string) {
		int sum = 0;
		char[] charArray = string.toCharArray();
		int length = string.length();
		
		for(int i = 0; i < length; i++) {
			sum += (int) charArray[i];
		}
		return sum;
	}


	public static int getRandomNumberFromList(LinkedList<Integer> sortedNumberList) {
		int low = 0;
		int high = sortedNumberList.size();
		
		Random r = new Random();
		int rand = r.nextInt(high-low) + low;
		int result = sortedNumberList.get(rand);
		
		return result;
	}
	
}
