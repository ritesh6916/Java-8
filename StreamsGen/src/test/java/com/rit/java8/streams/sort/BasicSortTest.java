package com.rit.java8.streams.sort;

import java.util.List;

import com.rit.java8.streams.BasicData;

import junit.framework.TestCase;

public class BasicSortTest extends TestCase {

	BasicData data = BasicData.getBasicDataObject();

	BasicSort basicSort = new BasicSort();

	// sort integers of collection
	public void sortIntCollectionTest() {
		List<Integer> newIntData = basicSort.sortIntCollection(data.getIntNumbers());
		System.out.println("Actual Data: " + data.getIntNumbers());
		System.out.println("Sorted Data: " + newIntData);
	}

	// sort element in stream using comparator (Customized sorting) - Descending
	public void sortIntCollectionDescTest() {
		List<Integer> newIntData = basicSort.sortIntCollectionDesc(data.getIntNumbers());
		System.out.println("Actual Data: " + data.getIntNumbers());
		System.out.println("Sorted Data: " + newIntData);
	}

}
