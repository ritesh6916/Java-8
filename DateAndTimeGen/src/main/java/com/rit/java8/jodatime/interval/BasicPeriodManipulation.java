package com.rit.java8.jodatime.interval;

import java.time.LocalDate;
import java.time.Period;

public class BasicPeriodManipulation {

	public static void main(String[] args) {

		// creating LocalDate object
		LocalDate DOB = LocalDate.of(2000, 01, 17);

		// Calculating age as of todays date
		Period p = Period.between(DOB, LocalDate.now());
		System.out.printf("Your Aget is %d Year %d Month %d Days", p.getYears(), p.getMonths(), p.getDays());

	}
}
