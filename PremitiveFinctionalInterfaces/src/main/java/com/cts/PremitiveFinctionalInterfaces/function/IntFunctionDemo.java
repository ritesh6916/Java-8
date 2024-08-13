package com.cts.PremitiveFinctionalInterfaces.function;

import java.util.function.IntFunction;

public class IntFunctionDemo {

	/*
	 * IntFunction takes only one argument which is return-type because input
	 * argument is fixed as int, we can call appy() method by providing int value.
	 */

	public static void main(String[] args) {

		// IntFunction to square the number
		IntFunction<Integer> square = num -> num * num;
		System.out.println("Square of 5: " + square.apply(5));
		System.out.println("Square of 99: " + square.apply(99));
		System.out.println();

	}

}
