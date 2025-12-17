package com.rit.java8.streams.sort;

import java.util.List;
import java.util.stream.Collectors;

public class BasicSort {

	// sort integers of collection
	List<Integer> sortIntCollection(List<Integer> data) {

		List<Integer> result = data.stream().sorted().collect(Collectors.toList());
		return result;
	}

}
