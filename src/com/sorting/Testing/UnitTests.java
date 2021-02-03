package com.sorting.Testing;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import com.sorting.main.BinarySearch;
import com.sorting.main.SortArray;

public class UnitTests extends BinarySearch {
	
	public static void main(String[] args) {
		LinkedList<Integer> input1 = new TestInputData().input1();
		LinkedHashMap<Integer, Integer> binarySearchExpected1 = BinarySearchTestExpectedResult.binarySearchExpected1();
		LinkedList<Integer> sortExpected1 = SortingTestExpextedResult.sortExpected1();
		
		LinkedList<Integer> input2 = new TestInputData().input2();
		LinkedHashMap<Integer, Integer> binarySearchExpected2 = BinarySearchTestExpectedResult.binarySearchExpected2();
		LinkedList<Integer> sortExpected2 = SortingTestExpextedResult.sortExpected2();
		
		LinkedList<Integer> input3 = new TestInputData().input3();
		LinkedHashMap<Integer, Integer> binarySearchExpected3 = BinarySearchTestExpectedResult.binarySearchExpected3();
		LinkedList<Integer> sortExpected3 = SortingTestExpextedResult.sortExpected3();
		
		LinkedList<Integer> input4 = new TestInputData().input4();
		LinkedHashMap<Integer, Integer> binarySearchExpected4 = BinarySearchTestExpectedResult.binarySearchExpected4();
		LinkedList<Integer> sortExpected4 = SortingTestExpextedResult.sortExpected4();
		
		
		System.out.println("");
		
		System.out.println("~~~~~~~~~~Binary Search Unit Test 1~~~~~~~~~~");
		processBinarySearchTest(input1, binarySearchExpected1);
		
		System.out.println("~~~~~~~~~~Sort Unit Test 1~~~~~~~~~~");
		processSortTest(new TestInputData().input1(), sortExpected1);
		
		System.out.println("");
		
		System.out.println("~~~~~~~~~~Binary Search Unit Test 2~~~~~~~~~~");
		processBinarySearchTest(input2, binarySearchExpected2);
		
		System.out.println("~~~~~~~~~~Sort Unit Test 2~~~~~~~~~~");
		processSortTest(new TestInputData().input2(), sortExpected2);
		
		System.out.println("");
		
		System.out.println("~~~~~~~~~~Binary Search Unit Test 3~~~~~~~~~~");
		processBinarySearchTest(input3, binarySearchExpected3);
		
		System.out.println("~~~~~~~~~~Sort Unit Test 3~~~~~~~~~~");
		processSortTest(new TestInputData().input3(), sortExpected3);
		
		System.out.println("");
		
		System.out.println("~~~~~~~~~~Binary Search Unit Test 4~~~~~~~~~~");
		processBinarySearchTest(input4, binarySearchExpected4);
		
		System.out.println("~~~~~~~~~~Sort Unit Test 4~~~~~~~~~~");
		processSortTest(new TestInputData().input4(), sortExpected4);
		
		System.out.println("");
		
	}

	private static void processSortTest(LinkedList<Integer> input, LinkedList<Integer> sortExpected) {
		int size = input.size();
		boolean isError = false;
		
		String inputListStr = printList(input);
		
		LinkedList<Integer> sortedList = new SortArray().sort(input, size);
		for(int i = 0; i < size; i++) {
			if(!sortedList.get(i).equals(sortExpected.get(i))) {
				System.out.println("The Sort Algorithm didn't sort the values correctly");
				isError = true;
				break;
			}
		}
		
		if(!isError) {
			System.out.println("The Sort Algorithm Works perfectly");
		}
		
		System.out.println("");
		
		System.out.println("*****Input List*****");
		System.out.println(inputListStr);
		System.out.println("");
		
		
		System.out.println("*****Sorted Output List*****");
		String sortedListStr =  printList(sortedList);
		System.out.println(sortedListStr);
		
		System.out.println("");
	}

	
	private static String printList(LinkedList<Integer> input1) {
		int size = input1.size();
		String str = "";
		
		for(int i = 0; i < size; i++) {
			str += input1.get(i) + "\t";
		}
		return str;
	}

	//Sort the Input Array using Collections interface 
	//and check whether the Binary Search returns the correct 
	//index of a value from the Sorted Array
	//If returns the correct the correct index the Binary Search Works without issues
	private static void processBinarySearchTest(LinkedList<Integer> input, LinkedHashMap<Integer, Integer> binarySearchExpected) {
		int i, j, loc, selected;
		
		
		System.out.println("*****Input List*****");
		String inputListStr = printList(input);
		System.out.println(inputListStr);
		System.out.println("");
		
		//Sort the input by built in API
		Collections.sort(input);
		int size = input.size();
	    for (i = 0; i < size; i++) {
	        selected = input.get(i);
	        
	        
	        loc = new UnitTests().binarySearch(input, selected, 0, size - 1);
	        
	        int selectedItemIndex = binarySearchExpected.get(selected);
	        
	        System.out.println(" Expected Index of " + selected + " is " + selectedItemIndex);
	        
	        if( selectedItemIndex == loc ) {
	        	System.out.println(" Actual Index of " + selected + " is " + loc + ". Test Pass");
	        } else {
	        	System.out.println(" Actual Index of " + selected + " is " + loc + ". Test Fail");
	        }
	    }
	}
	
}
