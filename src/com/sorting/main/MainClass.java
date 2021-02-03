package com.sorting.main;

import java.util.LinkedList;

import com.sorting.Testing.TestInputData;

public class MainClass {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = InputData.getData();
		//LinkedList<Integer> list = TestInputData.input1();
		
		int size = list.size();
		String inputListStr = printList(list);

		SortArray sortArray = new SortArray();
		sortArray.sort(list, size);
		
		

		String sortedListStr = printList(list);
		
		System.out.println("~~~~~~~Input List~~~~~~~");
		System.out.println(inputListStr);
		
		System.out.println("");
		
		System.out.println("~~~~~~~Sorted List~~~~~~~");
		System.out.println(sortedListStr);

	}
	
	
	private static String printList(LinkedList<Integer> input1) {
		int size = input1.size();
		String str = "";
		
		for(int i = 0; i < size; i++) {
			str += input1.get(i) + "\t";
		}
		return str;
	}
}
