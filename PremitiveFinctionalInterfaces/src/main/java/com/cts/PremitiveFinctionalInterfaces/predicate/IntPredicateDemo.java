package com.cts.PremitiveFinctionalInterfaces.predicate;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {

		// static data for testing
		int[] numbers = { 1, 4, 6, 4, 3, 9, 12, 23, 54, 11, 67, 99, 100 };
		System.out.print("Numbers are: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();

		// IntPredicate to check even number
		IntPredicate isEven = i -> i % 2 == 0;

		System.out.print("Even Numbers are: ");
		for (int number : numbers) {
			if (isEven.test(number)) {
				System.out.print(number + " ");
			}
		}
		System.out.println();

		// IntPredicate to check odd number
		IntPredicate isOdd = i -> i % 2 != 0;

		System.out.print("Odd Numbers are: ");
		for (int number : numbers) {
			if (isOdd.test(number)) {
				System.out.print(number + " ");
			}
		}
		System.out.println();

	}

}
