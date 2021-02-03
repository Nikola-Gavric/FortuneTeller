package com.sorting.Testing;

import java.util.LinkedHashMap;

public class BinarySearchTestExpectedResult {
	
	public static LinkedHashMap<Integer, Integer> binarySearchExpected1() {
		LinkedHashMap<Integer, Integer> expected = new LinkedHashMap<Integer, Integer>();
		
		expected.put(4, 0);
		expected.put(25, 1);
		expected.put(47, 2);
		expected.put(56, 3);
		expected.put(89, 4);
		
		return expected;
	}

	public static LinkedHashMap<Integer, Integer> binarySearchExpected2() {
		LinkedHashMap<Integer, Integer> expected = new LinkedHashMap<Integer, Integer>();
		
		expected.put(147, 0);
		expected.put(456, 1);
		expected.put(658, 2);
		expected.put(792, 3);
		expected.put(892, 4);
		
		return expected;
	}

	public static LinkedHashMap<Integer, Integer> binarySearchExpected3() {
		LinkedHashMap<Integer, Integer> expected = new LinkedHashMap<Integer, Integer>();
		
		expected.put(1025, 0);
		expected.put(4578, 1);
		expected.put(4785, 2);
		expected.put(9251, 3);
		expected.put(9851, 4);
		
		return expected;
	}

	public static LinkedHashMap<Integer, Integer> binarySearchExpected4() {
		LinkedHashMap<Integer, Integer> expected = new LinkedHashMap<Integer, Integer>();
		
		expected.put(4390, 0);
		expected.put(7605, 1);
		expected.put(8526, 2);
		expected.put(25010, 3);
		expected.put(95518, 4);
		
		return expected;
	}
	
}
