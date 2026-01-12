package com.rit.java8.jodatime.interval;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class BasicPeriodManipulation {

	public static void main(String[] args) {

		// creating LocalDate object
		LocalDate DOB = LocalDate.of(2000, 01, 17);

		// Calculating age as of todays date
		Period p = Period.between(DOB, LocalDate.now());
		System.out.printf("Your Aget is %d Year %d Month %d Days\n", p.getYears(), p.getMonths(), p.getDays());

		// Assume exam Date and create object
		LocalDate examDate = LocalDate.of(2028, Month.AUGUST, 17);

		// Calculating period of time left
		Period leftDuration = Period.between(LocalDate.now(), examDate);

		// Calculate days left
		long totalDays = leftDuration.getYears() * 365 + leftDuration.getMonths() * 30 + leftDuration.getDays();

		System.out.printf("Left time to Prepare is  : %d days %d Months %d Year which is approx %d days ",
				leftDuration.getDays(), leftDuration.getMonths(), leftDuration.getYears(), totalDays);

	}
}
