package com.sorting.main;

import java.util.LinkedList;

public abstract class BinarySearch {
	
	public int binarySearch(LinkedList<Integer> list, int item, int low, int high) {
	    if (high <= low) {
	    	return (item > list.get(low))?  (low + 1): low;
	    }
	    int mid = (low + high)/2;
	 
	    if(item == list.get(mid)) {
	    	return mid;
	    }
	        
	 
	    if(item > list.get(mid)) {
	    	return binarySearch(list, item, mid+1, high);
	    }
	    
	    return binarySearch(list, item, low, mid-1);
	}
}
