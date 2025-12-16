package com.rit.java8.streams.filter;

import com.rit.java8.streams.BasicData;

import junit.framework.TestCase;

public class BasicFilterTest extends TestCase {

	BasicFilter basicFilter = new BasicFilter();
	BasicData basicData = BasicData.getBasicDataObject();

	// Take even numbers form collection
	public void takeEvenCollectionTest() {
		basicFilter.takeEvenCollection(basicData.getIntNumbers());
	}

	// filter string by it's strength Test
	public void filterStringByLengthTest() {
		basicFilter.filterStringByLength(basicData.getStringData());
	}

}
