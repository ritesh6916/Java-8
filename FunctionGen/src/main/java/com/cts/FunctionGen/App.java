package com.cts.FunctionGen;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String ritesh = "Ritesh Singh is a Java Developer";

		// To remove spaces from a String
		Function<String, String> removeAllSpace = s -> s.replaceAll(" ", "");
		System.out.println("Original String: " + ritesh);
		System.out.println("After removing spaces: " + removeAllSpace.apply(ritesh) + "\n");

	}
}
