package com.rit.java8.jodatime.local;

import java.time.LocalDate;

public class BasicLocalDate {

	public static void main(String[] args) {

		// Give only local date in yyyy-mm-dd
		LocalDate todayDate = LocalDate.now();

		int dd = todayDate.getDayOfMonth();
		int mm = todayDate.getMonthValue();
		int yyyy = todayDate.getYear();

		System.out.println("Todays Date Default format:" + todayDate);
		System.out.println("dd/mm/yyyy " + dd + "/" + mm + "/" + yyyy);
		System.out.printf("dd-mm-yyy %d-%d-%d", dd, mm, yyyy);

	}

}
