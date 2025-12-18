package com.rit.java8.streams.aggregate;

import java.util.List;

public class BasicMinMax {

	// to get Minimum value from the stream
	Integer getMin(List<Integer> data) {

		// comparator is compulsory to pass with min(Comparator c) Ascending/Descending
		Integer minValue = data.stream().min((e1, e2) -> e1.compareTo(e2)).get();
		return minValue;
	}

	// to get maximum value from the stream
	Double getMax(List<Double> data) {

		// comparator is compulsory to pass with max(Comparator c) Ascending/Descending
		Double maxValue = data.stream().max((e1, e2) -> e1.compareTo(e2)).get();
		return maxValue;
	}
}
