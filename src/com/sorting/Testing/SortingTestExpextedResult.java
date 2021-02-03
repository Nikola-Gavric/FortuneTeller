package com.sorting.Testing;

import java.util.LinkedList;

public class SortingTestExpextedResult {
	public static LinkedList<Integer> sortExpected1() {
		LinkedList<Integer> expected = new LinkedList<Integer>();
		
		expected.add(4);
		expected.add(25);
		expected.add(47);
		expected.add(56);
		expected.add(89);
		
		return expected;
	}

	public static LinkedList<Integer> sortExpected2() {
		LinkedList<Integer> expected = new LinkedList<Integer>();
		
		expected.add(147);
		expected.add(456);
		expected.add(658);
		expected.add(792);
		expected.add(892);
		
		return expected;
	}

	public static LinkedList<Integer> sortExpected3() {
		LinkedList<Integer> expected = new LinkedList<Integer>();
		
		expected.add(1025);
		expected.add(4578);
		expected.add(4785);
		expected.add(9251);
		expected.add(9851);
		
		return expected;
	}

	public static LinkedList<Integer> sortExpected4() {
		LinkedList<Integer> expected = new LinkedList<Integer>();
		
		expected.add(4390);
		expected.add(7605);
		expected.add(8526);
		expected.add(25010);
		expected.add(95518);
		
		return expected;
	}
}
