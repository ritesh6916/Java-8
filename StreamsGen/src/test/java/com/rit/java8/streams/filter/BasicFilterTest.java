package com.rit.java8.streams.filter;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class BasicFilterTest extends TestCase {

	BasicFilter basicFilter = new BasicFilter();

	static List<Integer> intNumbers = new ArrayList<Integer>();
	static List<Double> doubleData = new ArrayList<Double>();
	static List<String> stringData = new ArrayList<String>();

	static {

		intNumbers.add(15);
		intNumbers.add(24);
		intNumbers.add(37);
		intNumbers.add(96);
		intNumbers.add(127);
		intNumbers.add(32);
		intNumbers.add(83);
		intNumbers.add(10);
		intNumbers.add(236);
		intNumbers.add(903);

		doubleData.add(100.0d);
		doubleData.add(178.0d);
		doubleData.add(199.0d);
		doubleData.add(165.0d);
		doubleData.add(67.0d);

		stringData.add("Ritesh Singh");
		stringData.add("Shyam");
		stringData.add("I love Java");
		stringData.add("Singh Rahul");
		stringData.add("Anuj Kashish");
	}

	// Take even numbers form collection
	public void takeEvenCollectionTest() {
		basicFilter.takeEvenCollection(intNumbers);
	}

	// filter string by it's strength Test
	public void filterStringByLengthTest() {
		basicFilter.filterStringByLength(stringData);
	}

}
