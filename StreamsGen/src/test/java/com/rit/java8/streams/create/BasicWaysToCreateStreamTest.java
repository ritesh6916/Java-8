package com.rit.java8.streams.create;

import java.util.stream.Stream;

import com.rit.java8.streams.BasicData;

import junit.framework.TestCase;

public class BasicWaysToCreateStreamTest extends TestCase {

	BasicData data = BasicData.getBasicDataObject();

	BasicWaysToCreateStream obj = new BasicWaysToCreateStream();

	// get Stream form a collection object - List
	public void getListStreamTest() {

		Stream<Integer> s1 = obj.getListStream(data.getIntNumbers());
		s1.forEach(e -> {
			System.out.println(e);
		});

		// Stream<List> s2 = obj.getListStream(data.getDoubleData());
		// Stream<List> s3 = obj.getListStream(data.getStringData());
	}

	// get Stream from Array of integer
	public void getArrayStreamTest() {
		Integer[] intArray = { 676, 23, 56, 86, 22, 56, 43, 233, 5664, 77, 88, 433, 9786, 347, 2456, 3232, 345, 44 };
		Stream<Integer> res = obj.getArrayStream(intArray);

		// Print in ascending sorted order
		res.sorted().forEach(System.out::println);
	}

	// get Stream form group of values - Strings
	public void getStringStreamTest() {
		Stream<String> strStream = obj.getStringStream();

		// sort String in descending order
		Stream<String> strSorted = strStream.sorted((e1, e2) -> e2.compareTo(e1));
		strSorted.forEach(System.out::println);

		System.out.println("\n>>>>>>>>>> Line Breaker >>>>>>>>>>>\n");

		// in one line for Ascending order
		obj.getStringStream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.println(e));
	}

	// get Stream form group of values - Double
	public void getDoubleStreamTest() {

		System.out.print("Original Values: ");
		obj.getDoubleStream().forEach(e -> System.out.print(e + "  "));

		System.out.print("\nAscending: ");
		obj.getDoubleStream().sorted().forEach(e -> System.out.print(e + "  "));

		System.out.print("\nDescending: ");
		obj.getDoubleStream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(e -> System.out.print(e + "  "));

		// remove duplicate
		System.out.print("\nUnique Values: ");
		obj.getDoubleStream().distinct().forEach(e -> System.out.print(e + "  "));
	}

	// to get an Array form stream or copy elements of stream into an array
	public void getArrayFromStreamTest() {

		Stream<Double> doubleStream = obj.getDoubleStream(); // Get Stream

		Double[] doubleArray = doubleStream.toArray(Double[]::new); // Array from Stream object

		for (Double d : doubleArray) {
			System.out.println(d);
		}
	}

}
