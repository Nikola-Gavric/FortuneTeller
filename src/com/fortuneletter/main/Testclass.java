package com.fortuneletter.main;

import java.util.List;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Testclass {

	private static final String scanner = null;
	@SuppressWarnings("resource")
	static List data = new LinkedList();

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("what is your name");
		String name = scanner.next();
		System.out.println("Enter the day of your birth");
		int day = scanner.nextInt();
		System.out.println("Enter the month of your birth");
		String month = scanner.next();
		int monthNumber = getMonthNumber(month);

		
		Date date = new Date();
		long time = date.getTime();
		
		LinkedList<Integer> sortedNumberList = RandomNumberGenerator.getSortedNumberList(name, day, monthNumber, time);
		
		
		
		Zodiac.zodiac_sign(day, month);
		LuckyNumber.getLuckyNumber(sortedNumberList);
		Color.luckyColor(sortedNumberList);
		TeaType.getTeaType(sortedNumberList);
		Fortune.getFortune(sortedNumberList);
		
	
		System.out.println("******** Today's Fortune ********");
		
		System.out.println("your zodiac sign is " + data.get(0));
		System.out.println("your lucky number is " + data.get(1));
		System.out.println("your lucky color is " + data.get(2));
		System.out.println("your tea type is " + data.get(3));
		System.out.println("your fortune : " + data.get(4));

	}

	private static int getMonthNumber(String month) {
		if (month.equalsIgnoreCase("december")) {
			return 12;
		}

		else if (month.equalsIgnoreCase("january")) {
			return 1;
		}

		else if (month.equalsIgnoreCase("february")) {
			return 2;
		}

		else if (month.equalsIgnoreCase("march")) {
			return 3;
		} else if (month.equalsIgnoreCase("april")) {
			return 4;
		}

		else if (month.equalsIgnoreCase("may")) {
			return 5;
		}

		else if (month.equalsIgnoreCase("june")) {
			return 6;
		}

		else if (month.equalsIgnoreCase("july")) {
			return 7;
		}

		else if (month.equalsIgnoreCase("august")) {
			return 8;
		}

		else if (month.equalsIgnoreCase("september")) {
			return 9;
		}

		else if (month.equalsIgnoreCase("october")) {
			return 10;
		}

		else if (month.equalsIgnoreCase("november")) {
			return 11;
		}
		return 0;
	}

}
