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

		// Supplier to generate 6 digit OTP
		Supplier<Integer> generateSixDigitOTP = () -> {
			return (int) (Math.random() * 1000000);
		};
		System.out.println("your OTO is " + generateSixDigitOTP.get());

		// Generate password(8L) with even place digit & odd place (A-Z,@,*,#)
		Supplier<String> generateEightDigitPassword = () -> {

			String password = "";

			// Generate randome digit (0 - 9)
			Supplier<Integer> randomDigit = () -> {
				return (int) (Math.random() * 10);
			};

			// Generate character(A-Z,@,*,#)
			Supplier<Character> randomChar = () -> {
				char[] allowedChars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
						'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '@', '*', '#' };
				int index = (int) (Math.random() * 29);
				return allowedChars[index];
			};

			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0) {
					password = password + randomDigit.get();
				} else {
					password = password + randomChar.get();
				}
			}
			return password;
		};

		System.out.println("generated Password: " + generateEightDigitPassword.get());
	}
}
