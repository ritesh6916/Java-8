package com.rit.java8.streams.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicFilter {

	// Take even numbers form collection
	public void takeEvenCollection(List<Integer> numbers) {

		Stream<Integer> s = numbers.stream().filter(n -> n % 2 == 0);
		List<Integer> result = s.toList();
		System.out.println(result);

	}

	// increase number by 20 %
	void increaseBumberByTewntyPercent(List<Double> data) {

		List<Double> result = data.stream().map(d -> d + (d * 20 / 100)).collect(Collectors.toList());
		System.out.println(result);
	}

	// filter string by it's strength
	void filterStringByLength(List<String> data) {

		List<String> result = data.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println(result);
	}

}
