package com.rit.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class BasicData {

	private static List<Integer> intNumbers = new ArrayList<Integer>();
	private static List<Double> doubleData = new ArrayList<Double>();
	private static List<String> stringData = new ArrayList<String>();

	private static BasicData basicData = new BasicData();

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

	private BasicData() {

	}

	public static BasicData getBasicDataObject() {
		return basicData;
	}

	public List<Integer> getIntNumbers() {
		return intNumbers;
	}

	public List<Double> getDoubleData() {
		return doubleData;
	}

	public List<String> getStringData() {
		return stringData;
	}

}
