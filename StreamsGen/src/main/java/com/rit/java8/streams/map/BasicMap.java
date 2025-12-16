package com.rit.java8.streams.map;

import java.util.List;
import java.util.stream.Collectors;

public class BasicMap {

	// increase number by 20 %
	void increaseBumberByTewntyPercent(List<Double> data) {

		List<Double> result = data.stream().map(d -> d + (d * 20 / 100)).collect(Collectors.toList());
		System.out.println(result);
	}

	// convert string to upper-case
	List<String> convertStringToUppercase(List<String> data) {
		List<String> result = data.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		return result;
	}

}
