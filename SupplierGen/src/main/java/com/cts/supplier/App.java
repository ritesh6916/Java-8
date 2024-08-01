package com.cts.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {

		// Supplier to get System date
		Supplier<Date> systemDate = () -> new Date();
		System.out.println("Today's Date & Time: " + systemDate.get());

		// Supplier to Select random name
		Supplier<String> selectName = () -> {

			String[] names = { "Ritesh", "Shyam", "Anuj", "Rahul", "Beauti", "Prabhat", "Sus" };
			int index = (int) (Math.random() * 7);
			return names[index];
		};
		System.out.println("Randomly Selected name is: " + selectName.get());

	}
}
