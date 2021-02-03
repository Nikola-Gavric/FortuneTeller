package com.sorting.main;

import java.util.LinkedList;

public class SortArray extends BinarySearch implements InterfaceSort {
	
	public LinkedList<Integer> sort(LinkedList<Integer> list, int size) {
		insertionSort(list, size);
		return list;
	}

	@Override
	public void insertionSort(LinkedList<Integer> list, int size) {
		int i, j, loc, selected;
		
	    for (i = 1; i < size; ++i) {
	        j = i - 1;
	        selected = list.get(i);
	 
	        // find location where selected should be inserted
	        loc = binarySearch(list, selected, 0, j);
	 
	        // remove selected element from list and add it in search location
	        list.remove(i);
	        list.add(loc, selected);
	    }
	}
}
