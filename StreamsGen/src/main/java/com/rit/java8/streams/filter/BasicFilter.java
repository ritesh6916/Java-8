package com.rit.java8.streams.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicFilter {

	// Take even numbers form collection
	public void takeEvenCollection(List<Integer> numbers) {

		Stream<Integer> s = numbers.stream().filter(n -> n % 2 == 0);
		List<Integer> result = s.collect(Collectors.toList());
		System.out.println(result);

	}

	// filter string by it's strength
	void filterStringByLength(List<String> data) {

		List<String> result = data.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println(result);
	}

	// count Even numbers
	Long countEvenNumbers(List<Integer> data) {
		Long count = data.stream().filter(num -> num % 2 == 0).count();
		return count;
	}

}
