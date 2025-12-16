package com.rit.java8.streams.map;

import java.util.List;

import com.rit.java8.streams.BasicData;

import junit.framework.TestCase;

public class BasicMapTest extends TestCase {

	BasicMap basicMap = new BasicMap();
	BasicData basicData = BasicData.getBasicDataObject();

	// increase number by 20 % Test
	public void increaseBumberByTewntyPercentTest() {
		basicMap.increaseBumberByTewntyPercent(basicData.getDoubleData());
	}

	// convert string to upper-case Test
	public void convertStringToUppercaseTest() {

		List<String> result = basicMap.convertStringToUppercase(basicData.getStringData());
		System.out.println("Input Data: " + basicData.getStringData());
		System.out.println("Output Data: " + result);

	}
}
