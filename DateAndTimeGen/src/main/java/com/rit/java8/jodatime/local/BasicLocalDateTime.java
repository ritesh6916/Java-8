package com.rit.java8.jodatime.local;

import java.time.LocalDateTime;
import java.time.Month;

public class BasicLocalDateTime {

	public static void main(String[] args) {

		// Gives current system date and time gives "2026-01-13T01:05:54.371120200"
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("Default: " + dateTime);

		// extract date
		int dd = dateTime.getDayOfMonth();
		int mm = dateTime.getMonthValue();
		int yy = dateTime.getYear();
		System.out.printf("Date: %d-%d-%d\n", dd, mm, yy);

		// Extract time
		int h = dateTime.getHour();
		int m = dateTime.getMinute();
		int s = dateTime.getSecond();
		int ns = dateTime.getNano();
		System.out.printf("Time: %d:%d:%d.%d\n", h, m, s, ns);

		// get object from any particular date -> argument starts with Year
		LocalDateTime DOB = LocalDateTime.of(2000, Month.JANUARY, 17, 5, 50);

		System.out.printf("Date Of Birth: %d %d %d\n", DOB.getDayOfMonth(), DOB.getMonthValue(), DOB.getYear());
		// Output >>> Date Of Birth: 17 1 2000

		System.out.printf("Date Of Birth: %d %s %d\n", DOB.getDayOfMonth(), DOB.getMonth(), DOB.getYear());
		// Output >>> Date Of Birth: 17 JANUARY 2000

		// after 6 month
		System.out.println("Six months later: " + DOB.plusMonths(6));

		// after 5 Years
		System.out.println("Five Years later: " + DOB.plusYears(5));

		// before 20 Years
		System.out.println("Five Years later: " + DOB.minusYears(20));

		// after 6 weeks
		System.out.println("After 6 weeks: " + DOB.plusWeeks(6));
	}

}
