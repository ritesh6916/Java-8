package com.rit.java8.streams.aggregate;

import com.rit.java8.streams.BasicData;

import junit.framework.TestCase;

public class BasicMinMaxTest extends TestCase {

	BasicData data = BasicData.getBasicDataObject();

	BasicMinMax basicMinMax = new BasicMinMax();

	// to get Minimum value from the stream
	public void getMinTest() {
		System.out.println("Input Data: " + data.getIntNumbers());
		System.out.println("Output Data: " + basicMinMax.getMin(data.getIntNumbers()));
	}

	// to get maximum value from the stream
	public void getMaxTest() {
		System.out.println("Input Data: " + data.getDoubleData());
		System.out.println("Output Data: " + basicMinMax.getMax(data.getDoubleData()));
	}
}
