package com.rit.java8.streams.sort;

import java.util.List;
import java.util.stream.Collectors;

public class BasicSort {

	// sort integers of collection - Ascending
	List<Integer> sortIntCollection(List<Integer> data) {

		List<Integer> result = data.stream().sorted().collect(Collectors.toList());
		return result;
	}

	// sort element in stream using comparator (Customized sorting) - Descending
	List<Integer> sortIntCollectionDesc(List<Integer> data) {

		// (e1, e2) -> e1.compareTo(e2) is for natural sorting (Ascending)
		List<Integer> result = data.stream().sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		return result;
	}

}
