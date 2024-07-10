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
		System.out.println("Original String: " + ritesh + "\n");
		System.out.println("After removing spaces: " + removeAllSpace.apply(ritesh) + "\n");

		// To Count Spaces in the String
		Function<String, Integer> countSpace = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println("Space Count: " + countSpace.apply(ritesh));

	}
}
