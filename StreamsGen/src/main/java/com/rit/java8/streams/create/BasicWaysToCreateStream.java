package com.rit.java8.streams.create;

import java.util.List;
import java.util.stream.Stream;

public class BasicWaysToCreateStream {

	// get Stream form a collection object - List
	Stream<Integer> getListStream(List<Integer> data) {
		return data.stream();
	}

	// get Stream from Array of integer
	Stream<Integer> getArrayStream(Integer[] data) {
		return Stream.of(data);
	}

	// get Stream form group of values - Strings
	Stream<String> getStringStream() {
		return Stream.of("Ritesh", "Mohan", "Anuj", "Shyam", "Ramesh", "Rahul", "Harshvardhan");
	}

	// get Stream form group of values - Double
	Stream<Double> getDoubleStream() {
		return Stream.of(87.6, 86.3, 89.34, 22.3, 1.1, 45.6, 989.4, 453.213, 12.5, 86.3, 1.1);
	}

}
