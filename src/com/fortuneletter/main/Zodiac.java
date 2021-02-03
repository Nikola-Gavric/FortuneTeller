package com.fortuneletter.main;

import java.util.ArrayList;

abstract class Zodiac implements NewInterface {
	public static void zodiac_sign(int day, String month) {

		String astro_sign = "";

		if (month.equalsIgnoreCase("december")) {

			if (day < 22)
				astro_sign = "Sagittarius";
			else
				astro_sign = "capricorn";
		}

		else if (month.equalsIgnoreCase("january")) {
			if (day < 20)
				astro_sign = "Capricorn";
			else
				astro_sign = "aquarius";
		}

		else if (month.equalsIgnoreCase("february")) {
			if (day < 19)
				astro_sign = "Aquarius";
			else
				astro_sign = "pisces";
		}

		else if (month.equalsIgnoreCase("march")) {
			if (day < 21)
				astro_sign = "Pisces";
			else
				astro_sign = "aries";
		} else if (month.equalsIgnoreCase("april")) {
			if (day < 20)
				astro_sign = "Aries";
			else
				astro_sign = "taurus";
		}

		else if (month.equalsIgnoreCase("may")) {
			if (day < 21)
				astro_sign = "Taurus";
			else
				astro_sign = "gemini";
		}

		else if (month.equalsIgnoreCase("june")) {
			if (day < 21)
				astro_sign = "Gemini";
			else
				astro_sign = "cancer";
		}

		else if (month.equalsIgnoreCase("july")) {
			if (day < 23)
				astro_sign = "Cancer";
			else
				astro_sign = "leo";
		}

		else if (month.equalsIgnoreCase("august")) {
			if (day < 23)
				astro_sign = "Leo";
			else
				astro_sign = "virgo";
		}

		else if (month.equalsIgnoreCase("september")) {
			if (day < 23)
				astro_sign = "Virgo";
			else
				astro_sign = "libra";
		}

		else if (month.equalsIgnoreCase("october")) {
			if (day < 23)
				astro_sign = "Libra";
			else
				astro_sign = "scorpio";
		}

		else if (month.equalsIgnoreCase("november")) {
			if (day < 22)
				astro_sign = "scorpio";
			else
				astro_sign = "sagittarius";
		}

		Testclass.data.add(astro_sign);
	}

	public void zodiac_sign() {

	}

}
